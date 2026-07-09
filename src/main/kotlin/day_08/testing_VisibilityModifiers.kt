package day_08

fun main() {
    val rahul = BankAccount(balance = 100000)
    println("Your Bank Balance: ${rahul.getAmount()}")
}

class BankAccount(balance: Int) {
    private var amount = balance
    fun getAmount(): Int {
        return amount
    }
}