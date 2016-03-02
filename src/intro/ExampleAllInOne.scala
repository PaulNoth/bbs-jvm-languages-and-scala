package intro

trait Generic[T] {
  def getValue: T
}

class ExampleAllInOne {
  private val id = 1
  private var calls: Int = _
  private val array = Array(1, 2, 3)

  def coolMethod(): Unit = {
    println("hello")
  }

  def implicitReturn(): Int = {
    1
  }

  def ifElseIsValue(param: Int) = {
    val ret = if (param % 2 == 0) "even" else "odd"
    ret
  }

  def callSingleton() = {
    Singleton.staticMethod
  }

  def accessArrayAtIndex(i: Int) = {
    array(i)
  }

  def omitDot = {
    array contains 4
  }

  def toMultilineString = {
    """SELECT * FROM
      |Scala
      |where 1=1""".stripMargin
  }
}

object Singleton {
  def staticMethod = {
    1
  }
}

object Main extends App {
  println(new ExampleAllInOne toMultilineString)
}
