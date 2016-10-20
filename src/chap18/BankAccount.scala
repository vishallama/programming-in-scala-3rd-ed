package chap18

class BankAccount {

  private var bal: Int = 0

  def balance: Int = bal

  def deposit(amount: Int) = {
    require (amount > 0)
    bal += amount
  }

  def withdraw(amount: Int): Boolean =
    if (amount > balance) false
    else {
      bal -= amount
      true
    }
}
