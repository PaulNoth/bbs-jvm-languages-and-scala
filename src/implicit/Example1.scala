package `implicit`

object Example1 extends App {

  val c1 = new Complex(1, 2)
  val c2 = new Complex(2, 2)

  c1 + c2
  c1 + 2

 // 2 + c1
}
