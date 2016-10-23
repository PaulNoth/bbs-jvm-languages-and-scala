package companion

trait Complex2 {

  def + (that: Complex): Complex

  def + (that: Int): Complex

  def + (that: Double): Complex
}

object Complex2 {

  private class Complex2Impl private(val real: Double, val imag: Double) extends Complex2 {
    def + (that: Complex): Complex = {
      new Complex(this.real + that.real, this.imag + that.imag)
    }

    def + (that: Int): Complex = {
      new Complex(this.real + that, this.imag)
    }

    def + (that: Double): Complex = {
      new Complex(this.real + that, this.imag)
    }

    override def toString = {
      val sign = if(imag > 0) "+" else "-"
      "(" + real + sign + imag + "i)"
    }
  }

  private val id = 1

  def apply(real: Double, imag: Double) = {
    //new Complex2(real, imag)
  }
}
