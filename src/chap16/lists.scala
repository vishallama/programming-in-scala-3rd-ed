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


  // First-order methods on class List: A method is first-order if it does not
  // take any functions as arguments.

  // Concatenating two lists
  def append[T](xs: List[T], ys: List[T]): List[T] =
    xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

  println(append(List(1, 2), List(3, 4)))

  // Merge-sort
  def mergeSort[T](less: (T, T) => Boolean)
    (xs: List[T]): List[T] = {

    def merge(xs: List[T], ys: List[T]): List[T] =
      (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (less(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(mergeSort(less)(ys), mergeSort(less)(zs))
    }
  }

  println(mergeSort((x: Int, y: Int) => x < y) (List(5, 7, 0, 10, 3)))

  // Use of currying to specialize the mergeSort function for particular
  // comparison functions.
  val intSort = mergeSort((x: Int, y: Int) => x < y) _
  val reverseIntSort = mergeSort((x: Int, y: Int) => x > y) _
  val mixedInts = List(10, 0, 5, 3, 8, 4, 1)

  println(intSort(mixedInts))
  println(reverseIntSort(mixedInts))
}
