package day_01

fun main () {
    println("Enter a number: ")
    val num = readln().toInt()

    if(num > 0) println("Your number is Positive")
    else if(num < 0) println("Your number is Negative")
    else println("Your number is Zero")
}