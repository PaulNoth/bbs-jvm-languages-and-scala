package pattern

abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

// UnOp("-", UnOp("-", e)) => e      // Double negation
// BinOp("+", e, Number(0)) => e    // Adding zero
// BinOp("*", e, Number(1)) => e    // Multiplying by one
