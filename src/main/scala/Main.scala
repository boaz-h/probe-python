package sygus

import ast.ASTNode
import enumeration.InputsValuesManager
import net.liftweb.json.JsonAST.JObject
import net.liftweb.json.JsonParser
import org.antlr.v4.runtime.{BufferedTokenStream, CharStreams, RecognitionException, Token}

import util.control.Breaks._
import scala.concurrent.duration._
import trace.DebugPrints.{dprintln, iprintln}

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.Source.fromFile
import sygus.TokenParser

object Main extends App {
  val filename =
  //"src/test/benchmarks/euphony-test/exceljet3.sl"
  //"src/test/benchmarks/too-hard/43606446.sl"
  //"src/test/benchmarks/euphony-test/36462127.sl"
  //"src/test/resources/new_benchmarks/rotate_left.examples.json"
  //"src/test/resources/benchmarks/count_characters.examples.json"
  "src/test/resources/benchmarks/order.examples.json"
  //"src/test/resources/new_benchmarks/rotate_concat.examples.json"
  "src/test/resources/benchmarks/abbreviate_1_ex.examples.json"
  // "src/test/resources/old_benchmarks/string_length.examples.json"

  //"src/test/resources/old_benchmarks/vowel_count.examples.json"


  case class ExpectedEOFException() extends Exception

  def interpret(task: SygusFileTask, str: String): ASTNode = {
    val parser = new SyGuSParser(new BufferedTokenStream(new SyGuSLexer(CharStreams.fromString(str))))
    val parsed = parser.bfTerm()
    val visitor = new ASTGenerator(task)
    val ast = visitor.visit(parsed)
    if (parser.getCurrentToken.getType != Token.EOF) {
      throw ExpectedEOFException()
    }
    ast
  }

  def interpret(filename: String, str: String): Option[(ASTNode, List[Any])] = try {
    val task = new SygusFileTask(scala.io.Source.fromFile(filename).mkString)
    val ast = interpret(task, str)
    Some(ast, task.examples.map(_.output))
  } catch {
    case e: RecognitionException => {
      iprintln(s"Cannot parse program: ${e.getMessage}")
      None
    }
    case e: ResolutionException => {
      iprintln(s"Cannot resolve program: ${e.badCtx.getText}")
      None
    }
    case e: ExpectedEOFException => {
      iprintln("Expected <EOF>")
      None
    }
  }

  def synthesizeSyGus(filename: String, task: SygusFileTask, sizeBased: Boolean, probBased: Boolean, timeout: Int = 20000): List[ASTNode] = {
    val oeManager = new InputsValuesManager()

    val enumerator = if (!sizeBased) new enumeration.Enumerator(task.vocab, oeManager, task.examples.map(_.input))
    else new enumeration.ProbEnumerator(filename, task.vocab, oeManager, task, task.examples.map(_.input), probBased)
    val deadline = timeout.seconds.fromNow
    var p = List[ASTNode]()
    val t0 = System.currentTimeMillis / 1000

    breakable {
      for ((program, i) <- enumerator.zipWithIndex) {
        if (program.nodeType == task.functionReturnType) {
          val results = task.examples.zip(program.values).map(pair => pair._1.output == pair._2)
          if (results.forall(identity)) {
            p = List(program)
            iprintln(program.code)
            break
          }
        }

        if (!deadline.hasTimeLeft) {
          break
        }
      }
    }
    val t1 = System.currentTimeMillis / 1000
    iprintln(s"${t1 - t0}s")
    p
  }

  def synthesizePythonInner(task: PySynthesisTask, sizeBased: Boolean, timeout: Int = 300, bank: mutable.Map[Int, mutable.ArrayBuffer[ASTNode]], mini: mutable.Map[Int, mutable.ArrayBuffer[ASTNode]]): Option[(String, Int)] = {
    var rs: Option[(String, Int)] = None
    val oeManager = new InputsValuesManager()

    val enumerator = if (!sizeBased) new enumeration.PyEnumerator(
      task.vocab,
      oeManager,
      task.examples.map(_.input)) else
      new enumeration.PyProbEnumerator(task.vocab, oeManager, task.examples.map(_.input), false, false, 0, bank,
        mini)
    val deadline = timeout.seconds.fromNow

    breakable {
      for ((program, i) <- enumerator.zipWithIndex) {
        if (!deadline.hasTimeLeft) { //TODO: fix this!
          rs = Some(("None", timeout * 1000 - deadline.timeLeft.toMillis.toInt))
          break
        }

        if (program.nodeType == task.returnType) {
          val results = task.examples
            .zip(program.values)
            .map(pair => pair._1.output == pair._2)
          if (results.forall(identity)) {
            if (program.usesVariables) {
              rs = Some(
                (task.asInstanceOf[sygus.PythonPBETask].outputVar + " = " + PostProcessor.clean(program).code,
                  timeout * 1000 - deadline.timeLeft.toMillis.toInt))
              iprintln(s"(${rs.get._1}, ${rs.get._2}, ${program.height}, ${program.cost}, ${bank.values.toList.length})")
              break
            }
            else {
              oeManager.classValues.remove(program.values)
            }
          }
        }

        dprintln(s"[$i] (${program.height}) ${PostProcessor.clean(program).code}")
      }
    }

    rs
  }


  def synthesizePython(task: PySynthesisTask, sizeBased: Boolean, timeout: Int = 300) : Option[(String, Int)] =  synthesizePythonInner(task, sizeBased, timeout, mutable.Map[Int, mutable.ArrayBuffer[ASTNode]](), mutable.Map[Int, mutable.ArrayBuffer[ASTNode]]())

  def synthesize(filename: String, sizeBased: Boolean = true, probBased: Boolean = true) = {
    val task = new SygusFileTask(scala.io.Source.fromFile(filename).mkString)
    assert(task.isPBE)
    synthesizeSyGus(filename, task, sizeBased, probBased)
  }

  def pySynthesize(filename: String, sizeBased: Boolean = true): Option[(String, Int)] = {
    val task: PySynthesisTask = PythonPBETask.fromString(fromFile(filename).mkString, sizeBased)
    synthesizePython(task, sizeBased)
  }

  def runToken(filename: String, sizeBased: Boolean = true) = {
    val p = new TokenParser()
    // pass only the python program to the python parser
    val jsonString = scala.io.Source.fromFile(filename).mkString
    val pyInput = JsonParser.parse(jsonString).asInstanceOf[JObject].values("pyInput").asInstanceOf[String]
    val (bank, mini) = p.parse(pyInput).get
    val task: PySynthesisTask = PythonPBETask.fromString(jsonString, sizeBased)
    synthesizePythonInner(task, sizeBased, bank=bank, mini=mini)
  }

  trace.DebugPrints.setInfo()
  //SyGus or Python Benchmark
  if (filename.endsWith(".sl"))
    synthesize(filename)
  else if (filename.endsWith(".json"))
    pySynthesize(filename)
  else if (filename.endsWith(".py"))
    runToken(filename)

}