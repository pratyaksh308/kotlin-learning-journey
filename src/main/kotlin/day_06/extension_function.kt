package day_06

fun main () {
    println("Enter your name: ")
    val name = readln()

    if (name.isNotBlank()) {
        println("The first character of your name is ${name.firstChar()}")
    } else {
        println("Your did not enter a name.")
    }
}

fun String.firstChar (): Char {
    return this[0]
}