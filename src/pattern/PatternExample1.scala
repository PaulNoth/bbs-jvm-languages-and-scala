package pattern

object PatternExample1 extends App {

  println(UnOp("-", UnOp("-", Number(5))))  //--5
  println(UnOp("-",UnOp("-", UnOp("-", UnOp("-", UnOp("-", UnOp("-", Number(5)))))))) // ------5

}
