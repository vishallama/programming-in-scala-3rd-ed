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

  // Case sequences as partial functions: A sequence of cases in curly braces
  // can be used anywhere a function literal can be used. A case sequence in
  // essence is a more general function literal.
  // A case sequence has multiple entry points, each with their own list of
  // parameters. Each case is an entry point to the function, and the
  // parameters are specified with the pattern.
  def withDefault: Option[Int] => Int = {
    case Some(x) => x
    case None => 0
  }

  println(withDefault(Some(10)))
  println(withDefault(None))

  // Patterns in for expressions

  // Patterns match generated values
  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
  for ((country, capital) <- capitals)
    println("The capital of " + country + " is " + capital)

  // Patterns might not match generated values. Generated values that do not
  // match the pattern are discarded.
  val results = List(Some("apple"), None, Some("orange"))
  for (Some(fruit) <- results) println(fruit)
}
