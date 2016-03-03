package pattern

object PatternExample2 extends App {

  println(UnOp("-", UnOp("-", Number(5))))
  println(simplifyAll(UnOp("-", UnOp("-", Number(5)))))
  println(simplifyAll(UnOp("-",UnOp("-", UnOp("-", UnOp("-", UnOp("-", UnOp("-", Number(5)))))))))


  def simplifyAll(expr: Expr): Expr = {
    expr match {
      case UnOp("-", UnOp("-", e)) => simplifyAll(e)
      case BinOp("+", e, Number(0)) => simplifyAll(e)
      case BinOp("*", e, Number(1)) => simplifyAll(e)
      case UnOp(op, e) => UnOp(op, simplifyAll(e))
      case BinOp(op, l, r) => BinOp(op, simplifyAll(l), simplifyAll(r))
      case _ => expr
    }
  }
}
