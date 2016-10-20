package chap18

object time {

  val time = new Time
  
  // Update hour
  time.hour += 6
  println(time.hour)
  
  // Update minute
  time.minute = 59
  println(time.minute)
}
