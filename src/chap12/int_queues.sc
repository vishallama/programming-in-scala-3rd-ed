package chap12

object int_queues {
  
  val queue = new BasicIntQueue
  queue.put(10)
  queue.put(20)
  println(queue.get())
  println(queue.get())
}
