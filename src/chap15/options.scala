package chap15

object options extends App {
  val capitals =
    Map("France" -> "Paris", "Japan" -> "Tokyo")

  def show(x: Option[String]) = x match {
    case Some(s) => x
    case None => "?"
  }

  println(capitals get "France")
  println(capitals get "North Pole")

  println(show(capitals get "France"))
  println(show(capitals get "Japan"))
  println(show(capitals get "North Pole"))
}
