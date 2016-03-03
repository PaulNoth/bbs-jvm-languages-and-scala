package pattern

import companion.Complex


object PatternExample extends App {
  val list1 = List(1, 2, 3, 4, 5, 6, 7)
  val list2 = List(2, 6, 5, 4, 4, 5)

  list1 match {
    case List(_, _, _, 5, 10, _, _, _, 6, _*) => "yes"
  }

}