package chap18

object bank_account {
  
  val account = new BankAccount
  account deposit 100
  account withdraw 80
  account withdraw 80
  println(account.balance)
}
