package collection

object InfiniteCollectionExample extends App {
  val infinite = fib(0, 1)
  println(infinite)
  println(infinite(10))
  println(infinite.size)

  def fib(a: Long, b: Long): Stream[Long] = {
    a #:: fib(b, a + b)
  }
}
