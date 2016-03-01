package option

object OptionExample extends App {
  val map = Map(1 -> "AAAA", 2 -> "BBB")

  val existingValue = map.get(2)
  val nonexistingValue = map.get(3)
  println(existingValue)
  println(nonexistingValue)

  existingValue.isDefined
}
