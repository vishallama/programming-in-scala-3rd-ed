package chap15

object Patterns {

  val v = Var("x")
  val expr = BinOp("+", Number(1), v)

  // Wild-card patterns
  expr match {
    case BinOp(_, _, _) => println(expr + " is a binary operation")
    case _ => println("It's something else")
  }
}
