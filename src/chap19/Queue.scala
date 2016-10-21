package chap19

class Queue[+T] private (
    private val leading: List[T],
    private val trailing: List[T]
    ) {

  def this(elems: T*) = this(elems.toList, Nil)

  private def mirror =
    if (leading.isEmpty)
      Queue(trailing.reverse, Nil)
    else
      this

  def head = mirror.leading.head

  def tail = {
      val q = mirror
      Queue(q.leading.tail, q.trailing)
  }

  def enqueue[U >: T](x: U) =
    Queue(leading, x :: trailing)
}

object Queue {
  // constructs a queue with initial elements 'xs'
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
}
