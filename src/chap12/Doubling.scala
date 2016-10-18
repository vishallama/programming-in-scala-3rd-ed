package chap12

trait Doubling extends IntQueue {
  // Doubling can only be mixed into a class that also extends IntQueue
  abstract override def put(x: Int) = { super.put(2 * x)}
}
