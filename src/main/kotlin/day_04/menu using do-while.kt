package day_04

fun main() {
    var input: Int

    do{
        println("\n---Menu---")
        println("1. Play")
        println("2. Settings")
        println("3. Exit")
        println("-------------")
        println("Select an option from the Menu")

        input = readln().toIntOrNull() ?: 0
    }
    while (input != 3)

    println("Exiting. Goodbye!")
}