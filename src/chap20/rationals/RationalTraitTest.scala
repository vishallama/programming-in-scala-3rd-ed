package chap20.rationals

object RationalTraitTest extends App {

  // Pre-initialized fields in an anonymous class expression
  val obj = new {
    val numerArg = 1
    val denomArg = 2
  } with RationalTrait

  println(obj)  // 1 / 2

  // Pre-initialized fields in an object definition
  object twoThirds extends {
    val numerArg = 2
    val denomArg = 3
  } with RationalTrait

  println(twoThirds.numerArg)  // 2
  println(twoThirds.denomArg)  // 3

  // Pre-initialized fields in a class definition
  class RationalClass(n: Int, d: Int) extends {
    val numerArg = n
    val denomArg = d
  } with RationalTrait {
    def + (that: RationalClass) = new RationalClass(
        numer * that.denom + that.numer * denom,
        denom * that.denom
        )
  }

  val oneThird = new RationalClass(1, 3)
  val oneHalf = new RationalClass(1, 2)

  println(oneThird + oneHalf)  // 5/6
}
