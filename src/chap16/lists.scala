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

  // Basic Operations on Lists: All operations on lists can be expressed in
  // terms of the following three: head, tail, and isEmpty.
  def insertionSort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, insertionSort(xs.tail))

  def insert(x: Int, xs: List[Int]): List[Int] =
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)

  println(insertionSort(List(2, 5, 3, 1, 4)))

  // Insertion sort using pattern matching
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => inserti(x, isort(xs1))
  }

  def inserti(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys =>
      if (x <= y) x :: xs
      else y :: inserti(x, ys)
  }

  println(isort(List(2, 5, 3, 1, 4)))
}
