package implic

object Conversions {

  implicit def convertIntToComplex(v: Int): Complex = {
    new Complex(v, 0)
  }
}
