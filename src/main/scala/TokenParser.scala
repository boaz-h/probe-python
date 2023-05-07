package sygus
import ast.ASTNode
import org.antlr.v4.runtime.{BufferedTokenStream, CharStreams}
import sygus.{Python3BaseVisitor, Python3Lexer, Python3Parser}

import scala.collection.mutable

class TokenParser extends Python3BaseVisitor[Option[(mutable.Map[Int, mutable.ArrayBuffer[ASTNode]], mutable.Map[Int, mutable.ArrayBuffer[ASTNode]])]] {
  type ParserOutput = Option[(mutable.Map[Int, mutable.ArrayBuffer[ASTNode]], mutable.Map[Int, mutable.ArrayBuffer[ASTNode]])]
  def parse(code: String) : ParserOutput =
  {
    val lexer = new Python3Lexer(CharStreams.fromString(code))
    lexer.removeErrorListeners()
    val parser = new Python3Parser(new BufferedTokenStream(lexer))
    this.visit(parser.funcdef())
    Some((mutable.Map[Int, mutable.ArrayBuffer[ASTNode]](), mutable.Map[Int, mutable.ArrayBuffer[ASTNode]]()))
  }

  override def visitProbe_expr(ctx: Python3Parser.Probe_exprContext): ParserOutput =
    {
      println("in probe expr")
      super.visitProbe_expr(ctx)
    }

  override def visitFuncdef(ctx: Python3Parser.FuncdefContext): ParserOutput =
    {
      println(f"in func ${ctx.NAME().getText}")
      super.visitFuncdef(ctx)
    }

  override def visitTfpdef(ctx: Python3Parser.TfpdefContext): ParserOutput =
    {
      val argType = ctx.test() match {
        case null => None
        case t => t.accept(new Python3BaseVisitor[ParserOutput]{
          override def visitAtom_expr(ctx: Python3Parser.Atom_exprContext): ParserOutput =
            {
              val trail = ctx.trailer()
//              if (!trail.isEmpty)
//                {
//                  trail.iterator().next().
//                }
              super.visitAtom_expr(ctx)
            }


          override def visitSubscriptlist(ctx: Python3Parser.SubscriptlistContext): ParserOutput =
            {
              println("in subscript list")
              super.visitSubscriptlist(ctx)
            }
        })
      }
      println(f"param: ${ctx.NAME()}. type: ${argType}")

      super.visitTfpdef(ctx)
    }

}

