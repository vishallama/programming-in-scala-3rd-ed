package chap04

import ChecksumAccumulator.calculate

object Seasons extends App {

  for (season <- List("Fall", "Winter", "Spring", "Summer"))
    println(season + ": " + calculate(season))
}
