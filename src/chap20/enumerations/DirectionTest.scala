package chap20.enumerations

object DirectionTest extends App {

  for (d <- Direction.values)
    print(d + " ")
  // North East South West

  println()
  println(Direction.East.id)  // 1

  println(Direction(0))       // North
}
