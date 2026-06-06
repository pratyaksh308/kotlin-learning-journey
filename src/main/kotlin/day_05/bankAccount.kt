package day_05

fun main () {
    println("Enter Account holder's name: ")
    val holder = readln()

    println("Your current balance is: 500000.0rs")
    val account = BankAccount(holder, 500000f)

    println("Enter deposit amount: ")
    var amount = readln().toFloatOrNull() ?: 0f

    while (amount <= 0){
        print("Enter a valid deposit amount:")
        amount = readln().toFloatOrNull() ?: 0f
    }

    account.deposit(amount)
}

class BankAccount(val accountHolder: String, var balance: Float) {
    fun deposit(amount: Float) {
        balance += amount
        println("Successfully deposited $amount")
        println("New Balance: $balance")
    }
}