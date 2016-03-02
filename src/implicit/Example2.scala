package `implicit`

object Example2 extends App {

  val c1 = new Complex(1, 2)
  val c2 = new Complex(2, 2)

  c1 + c2
  c1 + 2

  convertIntToComplex(2) + c1
  convertIntToComplex(3) + c1
  convertIntToComplex(4) + c1
  convertIntToComplex(6) + c1


  def convertIntToComplex(v: Int): Complex = {
    new Complex(v, 0)
  }
}
