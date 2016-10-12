package chap15

object case_expr {
  
  // Objects can be created without using the `new` keyword.
  val v = Var("x")
  val op = BinOp("+", Number(1), v)
  
  // All arguments in the parameter list of a case class implicity
  // get a val prefix, so they are maintained as fields.
  println(v.name)
  println(op.left)
  
  // The compiler adds "natural" implementations of methods toString,
  // hashCode, and equals to the case class.
  println(op)
  println(op.right == Var("x"))
  
  // The compiler adds a copy method to a case class for making modified
  // copies.
  val minusOp = op.copy(operator = "-")
  println(minusOp)
}
