package chap12

object my_queue {
  
  val queue = new MyQueue
  queue.put(10)
  println(queue.get())
}
