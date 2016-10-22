package chap20.rationals

trait LazyRationalTrait {
  val numerArg: Int
  val denomArg: Int

  private lazy val g = {
    require (denomArg != 0)
    gcd(numerArg, denomArg)
  }
  lazy val numer = numerArg / g
  lazy val denom = denomArg / g

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def toString = numer + "/" + denom
}
