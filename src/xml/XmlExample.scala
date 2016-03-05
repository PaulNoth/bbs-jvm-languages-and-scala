package xml

object XmlExample extends App {

  val xml = <a><b atribute="att">inside text</b></a>

  val myText = "this is my brownbag ession"
  val evaluatedLiteral = <a><b atribute="att">{myText}</b></a>

  println(evaluatedLiteral)
}
