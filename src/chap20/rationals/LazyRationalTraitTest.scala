package chap20.rationals

object LazyRationalTraitTest extends App {

  val obj = new LazyRationalTrait {
    val numerArg = 1
    val denomArg = 2
  }

  println(obj)  // 1/2
}
