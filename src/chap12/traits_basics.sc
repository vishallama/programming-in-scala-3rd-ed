package chap12

object traits_basics {
  
  val frog = new Frog
  println(frog.philosophize())
  
  // A trait also defines a type
  val phil: Philosophical = frog
  println(phil.philosophize())
  
  val phrog: Philosophical = new Frog
  println(phrog.philosophize())
}
