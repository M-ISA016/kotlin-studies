fun main() { // Mark Zuckenberg's Bank Account
    val account1 = BankAccount()
    account1.owner = "Mark Zuckenberg"
    account1.deposit(1200.0)
    account1.withdraw(500.0)

    val balance = account1.checkBalance()
    println("${account1.owner}, o seu saldo é R$$balance")
}

    class BankAccount {

        var balance: Double = 0.0
        var owner: String = ""

        fun deposit(value: Double) {
            balance += value
        }

        fun withdraw(value: Double) {
            balance -= value
        }

        fun checkBalance(): Double {
            return balance
        }
    }
