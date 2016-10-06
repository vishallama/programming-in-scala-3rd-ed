package chap05

object basic_types_and_operations {
  println("Chapter 5: Basic Types and Operations")//> Chapter 5: Basic Types and Operations
  println()                                       //> 
  
  // Logical and Relational Operators
  def salt() = { println("salt"); false }         //> salt: ()Boolean
  
  def pepper() = { println("pepper"); true }      //> pepper: ()Boolean
  
  pepper() && salt()                              //> pepper
                                                  //| salt
                                                  //| res0: Boolean = false
  
  salt() && pepper()                              //> salt
                                                  //| res1: Boolean = false
  
  salt() & pepper()                               //> salt
                                                  //| pepper
                                                  //| res2: Boolean = false
  
  /*
  	All Scala methods have a facility for delaying the evaluation
    of their arguments, or even declining to evaluate them at all.
    This facility is called by-name parameters.
  */
}