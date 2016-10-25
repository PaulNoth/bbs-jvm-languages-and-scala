package pattern

object PatternExample extends App {
  val list1 = List(1, 2, 3, 4, 5, 6, 7)
  val list2 = List(2, 6, 5, 4, 4, 5)


  def describe(x: Any) = {
    x match {
      case 5 => "five"
      case true => "truth"
      case "hello" => "hi!"
      case Nil => "the empty list"
      case _ => "something else"
    }
  }

  val m = list1 match {
    case List(_, _, _, 5, 10, _, _, _, 6, _*) => "yes"
    case _ => "no"
  }

  val n = list2 match {
    case List(2, 6, _*) => "yes"
    case _ => "no"
  }

  list1 match {
    case x::xs => println(xs)
  }

  println(m)
  println(n)
}
