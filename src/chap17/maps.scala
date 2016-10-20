package chap17

import scala.collection.mutable

object maps extends App {

  // Count the number of times each word occurs in a string
  def countWords(text: String) = {
    val counts = mutable.Map.empty[String, Int]
    for (rawWord <- text.split("[ ,!.]+")) {
      val word = rawWord.toLowerCase
      val oldCount =
        if (counts.contains(word)) counts(word)
        else 0
      counts += (word -> (oldCount + 1))
    }
    counts
  }

  println(countWords("See Spot run! Run, Spot. Run!"))
}
