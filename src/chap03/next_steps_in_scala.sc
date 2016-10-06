package chap03

object next_steps_in_scala {
  println("Chapter 3: Next Steps in Scala")       //> Chapter 3: Next Steps in Scala
  println()                                       //> 
  
  // Parameterize arrays with types
  val greetStrings = new Array[String](3)         //> greetStrings  : Array[String] = Array(null, null, null)
  
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"
  
  for (i <- 0 to 2)
  	print(greetStrings(i))                    //> Hello, world!
  
  val numNames = Array("zero", "one", "two")      //> numNames  : Array[String] = Array(zero, one, two)
  
  // Use lists
  val oneTwoThree = List(1, 2, 3)                 //> oneTwoThree  : List[Int] = List(1, 2, 3)
  val oneTwo = List(1, 2)                         //> oneTwo  : List[Int] = List(1, 2)
  val threeFour = List(3, 4)                      //> threeFour  : List[Int] = List(3, 4)
  val oneTwoThreeFour = oneTwo ::: threeFour      //> oneTwoThreeFour  : List[Int] = List(1, 2, 3, 4)
  println(oneTwo + " and " + threeFour + " were not mutated.")
                                                  //> List(1, 2) and List(3, 4) were not mutated.

  println("Thus, " + oneTwoThreeFour + " is a new list.")
                                                  //> Thus, List(1, 2, 3, 4) is a new list.
  
  val twoThree = List(2, 3)                       //> twoThree  : List[Int] = List(2, 3)
  val oneTwoThree_ = 1 :: twoThree                //> oneTwoThree_  : List[Int] = List(1, 2, 3)
  println(oneTwoThree_)                           //> List(1, 2, 3)

  // Some List methods and usages
  val thrill = "Will" :: "fill" :: "until" :: Nil //> thrill  : List[String] = List(Will, fill, until)
  thrill(2)                                       //> res0: String = until
  thrill.count(s => s.length == 4)                //> res1: Int = 2
  thrill.drop(2)                                  //> res2: List[String] = List(until)
  thrill.dropRight(2)                             //> res3: List[String] = List(Will)
  thrill.exists(s => s == "until")                //> res4: Boolean = true
  thrill.filter(s => s.length == 4)               //> res5: List[String] = List(Will, fill)
  thrill.forall(s => s.endsWith("l"))             //> res6: Boolean = true
  thrill.foreach(s => print(s))                   //> Willfilluntil
  thrill.foreach(print)                           //> Willfilluntil
  thrill.head                                     //> res7: String = Will
  thrill.init                                     //> res8: List[String] = List(Will, fill)
  thrill.isEmpty                                  //> res9: Boolean = false
  thrill.last                                     //> res10: String = until
  thrill.length                                   //> res11: Int = 3
  thrill.map(s => s + "y")                        //> res12: List[String] = List(Willy, filly, untily)
  thrill.mkString(", ")                           //> res13: String = Will, fill, until
  thrill.filterNot(s => s.length == 4)            //> res14: List[String] = List(until)
  thrill.reverse                                  //> res15: List[String] = List(until, fill, Will)
  thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)
                                                  //> res16: List[String] = List(fill, until, Will)
  thrill.tail                                     //> res17: List[String] = List(fill, until)
}