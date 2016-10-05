package chap01

object a_scalable_language {
  println("Chapter 1: A Scalable Language")       //> Chapter 1: A Scalable Language
  println()                                       //> 
  
  // Maps
  var capital = Map("US" -> "Washington", "France" -> "Paris")
                                                  //> capital  : scala.collection.immutable.Map[String,String] = Map(US -> Washing
                                                  //| ton, France -> Paris)
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))                      //> Paris
  
  // Factorial
  def factorial(x: BigInt): BigInt = {
  	if (x == 0) 1 else x * factorial(x - 1)
  }                                               //> factorial: (x: BigInt)BigInt
  
  println("factorial(30) = " + factorial(30))     //> factorial(30) = 265252859812191058636308480000000
}