package day_06

fun main () {
    println("Enter a number: ")
    val num = readln().toIntOrNull() ?: 0

    if(num.isEven()) println("$num is Even")
    else println("$num is Odd")
}

fun Int.isEven(): Boolean = this % 2 == 0