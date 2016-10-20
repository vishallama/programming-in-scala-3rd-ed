package chap18

class Thermometer {

  var celcius: Float = _

  def fahrenheit = celcius * 9 / 5 + 32
  def fahrenheit_= (f: Float) = {
    celcius = (f - 32) * 5 / 9
  }

  override def toString = fahrenheit + "F/" + celcius + "C"
}
