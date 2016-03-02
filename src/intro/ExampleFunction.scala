package intro

object ExampleFunction extends App {
  val adder: Int => Int = {
    _ + 1
  }

  def invokeFuntion(f: Int => Int): Int = {
    f(1)
  }

  println(adder(2))
  println(invokeFuntion(adder))
}
