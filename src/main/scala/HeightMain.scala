package sygus

import ast.{ASTNode, BVAdd, BVAnd, BVEquals, BVITE, BVMul, BVNeg, BVNot, BVOr, BVSDiv, BVSRem, BVShiftLeft, BVShrArithmetic, BVShrLogical, BVSub, BVUDiv, BVURem, BVVariable, BVXor, BoolLiteral, BoolVariable, Contains, IndexOf, IntAddition, IntEquals, IntITE, IntLessThanEq, IntLiteral, IntSubtraction, IntToString, IntVariable, LAnd, LNot, LOr, PrefixOf, StringAt, StringConcat, StringITE, StringLength, StringLiteral, StringReplace, StringToInt, StringVariable, Substring, SuffixOf}
import enumeration.ProbUpdate
import enumeration.{InputsValuesManager}
import util.control.Breaks._
import scala.concurrent.duration._
import trace.DebugPrints.{dprintln, iprintln}
import pcShell.ConsolePrints._

object HeightMain extends App {
  def runBenchmarks(filename: String,
                    resultPrinter: (ASTNode, Long, Long) => String
                   ): String = {
    var program: List[ASTNode] = null
    val t0 = System.currentTimeMillis()
    ProbUpdate.resetPrior()
    program = synthesizeFullSols(filename)
    val t1 = System.currentTimeMillis()
    if (!program.isEmpty) {
      println(filename + resultPrinter(program.head, t1 - t0, program.head.terms))
      filename + resultPrinter(program.head, t1 - t0, program.head.terms)
    }
    else {
      println(filename + ",None" + ",Timeout" + "None")
      filename + ",None" + ",Timeout" + ",None"
    }
  }

  def regularBenchmarkPrinter(program: ASTNode, msec: Long, size: Long): String = {
    "," + program.code + "," + (msec.toFloat / 1000) + "," + size
  }

  val probeBenchmarks = runBenchmarks(args(0), regularBenchmarkPrinter)
  //tooHardBenchmarks.foreach(println)
  def synthesizeFullSols(filename: String) = {
    val task = new SygusFileTask(scala.io.Source.fromFile(filename).mkString)
    assert(task.isPBE)
    synthesizeProbe(task)
  }

  def synthesizeProbe(task: SygusFileTask, timeout: Int = 600): List[ASTNode] = {
    val oeManager = new InputsValuesManager()
    val enumerator = new enumeration.Enumerator(task.vocab, oeManager, task.examples.map(_.input))
    //val foundPrograms: mutable.Map[List[Boolean], mutable.ListBuffer[ASTNode]] = mutable.HashMap()
    val deadline = timeout.seconds.fromNow
    var p = List[ASTNode]()

    breakable {
      for ((program, i) <- enumerator.zipWithIndex) {
        if (program.nodeType == task.functionReturnType) {
          val results = task.examples.zip(program.values).map(pair => pair._1.output == pair._2)
          //There will only be one program matching 1...1, but potentially many for 1..101..1, do rank those as well?
          if (results.forall(identity)) {
            p = List(program)
            iprintln(program.code)
            break
          }
        }

        if ((consoleEnabled && in.ready()) || !deadline.hasTimeLeft) {
          cprintln("")
          break
        }
      }
    }
    p
  }

}