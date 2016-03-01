package stackable

object Example2 extends App {
  val queue1 = new BasicIntQueue with Incrementing with Filtering
  queue1.put(0)
  queue1.put(1)

  val queue2 = new BasicIntQueue with Filtering with Incrementing
  queue2.put(0)
  queue2.put(1)

  // output ?
  println("queue1: " + queue1)
  println("queue2: " + queue2)
}
