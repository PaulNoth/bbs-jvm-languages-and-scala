package `implicit`

object Conversions {

  implicit def convertIntToComplex(v: Int): Complex = {
    new Complex(v, 0)
  }
}
