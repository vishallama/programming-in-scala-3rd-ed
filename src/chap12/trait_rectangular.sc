package chap12

object trait_rectangular {
  
  val rect = new Rectangle(new Point(1, 1), new Point(10, 10))
                                                  //> rect  : chap12.Rectangle = chap12.Rectangle@2b05039f
  println(rect.left)                              //> 1
  println(rect.right)                             //> 10
  println(rect.width)                             //> 9
}