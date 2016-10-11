package chap11

object scala_hierarchy {

  // Nothing is a subtype of every other type, including Null
  def divide(x: Int, y: Int): Int =
    if (y != 0) x / y
    else error("can't divide by zero")
  
  // Defining your own value classes
  class Dollars(val amount: Int) extends AnyVal {
    override def toString = "$" + amount
  }
  
  class SwissFrancs(val amount: Int) extends AnyVal {
    override def toString = amount + " CHF"
  }
  
  val dollars = new Dollars(1000)
  println(dollars)
  
  val francs = new SwissFrancs(1000)
  println(francs)
}