package chap09

object by_name_parameters {
  var assertionsEnabled = true
  
  def myAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError
  
  println(myAssert(5 > 3))
  
  // If assertionsEnabled is false, the expression inside the parentheses in
  // myAssert is *not* evaluated before the call to myAssert. Instead, a
  // function value will be created whose apply method will evaluate
  // 5 / 0 == 0, and this function value will be passed to myAssert
  assertionsEnabled = false
  println(myAssert( 5 / 0 == 0))
}
