package stackable

object Example1 extends App {

  val queue1 = new BasicIntQueue
  queue1.put(1)

  val queue2 = new BasicIntQueue with Incrementing
  queue2.put(1)

  // output?
  println("queue1: " + queue1)
  println("queue2: " + queue2)
}
