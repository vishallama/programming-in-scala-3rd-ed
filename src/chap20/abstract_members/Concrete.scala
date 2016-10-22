package chap20.abstract_members

class Concrete {
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  var current = initial
}
