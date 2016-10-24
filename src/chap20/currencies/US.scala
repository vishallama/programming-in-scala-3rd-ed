package chap20.currencies

object US extends CurrencyZone {
  abstract class Dollar extends AbstractCurrency {
    def designation = "USD"
  }

  type Currency = Dollar

  def make(x: Long) = new Dollar { val amount = x}
}
