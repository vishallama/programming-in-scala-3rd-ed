package chap07

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

import java.net.URL
import java.net.MalformedURLException

object try_expressions {

  // An exception throw has type Nothing. You can use a throw as an
  // expression even though it will never actually evaluate to anything.

  val n = 4
  val half =
    if (n % 2 == 0)
      n / 2
    else
      throw new RuntimeException("n must be even")

  // Catching exceptions
  try {
    val file = new FileReader("input.txt")
    // Use and close file
  } catch {
    case ex: FileNotFoundException => "File not found"
    case ex: IOException => "I/O error"
  } finally {
    "Can't determine the exception"
  }

  // Yielding a value
  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
    case e: MalformedURLException =>
      new URL("https://www.scala-lang.org")
    }

  println(urlFor("http://www.scala-ide.org")) // "http://www.scala-ide.org"
  println(urlFor("www-malformed-url"))        // "https://www.scala-lang.org"

  def f(): Int = try return 1 finally return 2   // 2
  def g(): Int = try 1 finally 2                 // 1

  println(f())
  println(g())
}
