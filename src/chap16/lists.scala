package chap16

object lists extends App {

  // List literals
  val fruits: List[String] = List("apples", "bananas", "cucumber")
  val numbers: List[Int] = List(1, 2, 3, 4, 5)
  val diagonal3: List[List[Int]] =
    List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
        )
  val empty: List[Nothing] = List()

  // The empty list has type List[Nothing]. Nothing is the bottom type in
  // Scala's hierarchy. Because lists are covariant, it follows that
  // List[Nothing] is a subtype of List[T] for any type T. So, the empty list
  // object can also be seen as an object of every other list type of the form
  // List[T]. That's why it is okay to write code like this:
  val xs: List[String] = List()
}
