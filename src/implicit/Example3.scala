package `implicit`

//import Conversions._

object Example3 extends App {

  val c1 = new Complex(1, 2)
  val c2 = new Complex(2, 2)

  c1 + c2
  c1 + 2

  2 + c1
  3 + c1
  4 + c1
  6 + c1
}
