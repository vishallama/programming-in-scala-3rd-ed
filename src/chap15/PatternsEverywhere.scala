package chap15

object PatternsEverywhere extends App {

  // Patterns in variable definitions
  val tuple = (1, "one")
  val (number, string) = tuple
  println(number)
  println(string)

  val exp = BinOp("*", Number(1), Number(2))
  val BinOp(op, left, right) = exp
  println(op)
  println(left)
  println(right)
}
