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

    private def decimals(n: Long): Int =
      if (n == 1) 0 else 1 + decimals(n / 10)

    override def toString =
      ((amount.toDouble / CurrencyUnit.amount.toDouble)
          formatted ("%." + decimals(CurrencyUnit.amount) + "f")
          + " " + designation)
  }

  val CurrencyUnit: Currency
}
