package chap07

object match_expressions {

  // Food items
  val foodItems = Array("salt", "chips", "eggs", "muffin", "donut")
  val foodItem = foodItems(0)
 
  val friend =
	  foodItem match {
	    case "salt" => "pepper"
	    case "chips" => "salsa"
	    case "eggs" => "bacon"
	    case "_" => "huh?"
    }
}
