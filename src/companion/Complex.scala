package companion

class Complex(val real: Double, val imag: Double) {

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
    "(" + real + sign + imag + "i)" + Complex.id
  }
}

object Complex {

  private val id = 1

  def apply(real: Double, imag: Double) = {
    new Complex(real, imag)
  }
}

