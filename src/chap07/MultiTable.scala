package chap07

object MultiTable extends App {

  // Returns a row as a sequence
  def makeRowSeq(row: Int) = {
    val maxPadding = 4

    for (col <- 1 to 10) yield {
      val prod = (row * col).toString
      val padding = " " * (maxPadding - prod.length)
      padding + prod
    }
  }

  // Returns a row as a string
  def makeRow(row: Int) = makeRowSeq(row).mkString

  // Returns a table as a string with one row per line
  def multiTable() = {
    val tableSeq =
      for (row <- 1 to 10)
        yield makeRow(row)
    tableSeq.mkString("\n")
  }

  // Print Multiplication Table
  println(multiTable())
}
