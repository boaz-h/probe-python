package sygus
import org.antlr.v4.runtime.{BufferedTokenStream, CharStreams}
import sygus.{Python3BaseVisitor, Python3Lexer, Python3Parser}

class TokenParser extends Python3BaseVisitor[Option[Any]] {
  def parse(code: String) : Option[Any] =
  {
    val lexer = new Python3Lexer(CharStreams.fromString(code))
    lexer.removeErrorListeners()
    val parser = new Python3Parser(new BufferedTokenStream(lexer))
    this.visit(parser.funcdef())
  }

  override def visitProbe_expr(ctx: Python3Parser.Probe_exprContext): Option[Any] =
    {
      println("in probe expr")
      super.visitProbe_expr(ctx)
    }

  override def visitFuncdef(ctx: Python3Parser.FuncdefContext): Option[Any] =
    {
      println(f"in func ${ctx.NAME().getText}")
      super.visitFuncdef(ctx)
    }

  override def visitTfpdef(ctx: Python3Parser.TfpdefContext): Option[Any] =
    {
      val argType = ctx.test() match {
        case null => None
        case t => t.accept(new Python3BaseVisitor[Option[Any]]{
          override def visitAtom_expr(ctx: Python3Parser.Atom_exprContext): Option[Any] =
            {
              val trail = ctx.trailer()
//              if (!trail.isEmpty)
//                {
//                  trail.iterator().next().
//                }
              super.visitAtom_expr(ctx)
            }


          override def visitSubscriptlist(ctx: Python3Parser.SubscriptlistContext): Option[Any] =
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

