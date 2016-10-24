package chap20.currencies

abstract class CurrencyZone {

  type Currency <: AbstractCurrency
  def make(x: Long): Currency

  abstract class AbstractCurrency {

    val amount: Long
    def designation: String

    def + (that: Currency): Currency =
      make(this.amount + that.amount)

    def * (x: Double): Currency =
      make((this.amount * x).toLong)

    def - (that: Currency): Currency =
      make(this.amount - that.amount)

    def / (that: Double) =
      make((this.amount / that).toLong)

    def / (that: Currency) =
      this.amount.toDouble / that.amount

    override def toString = amount + " " + designation
  }

  val CurrencyUnit: Currency
}
