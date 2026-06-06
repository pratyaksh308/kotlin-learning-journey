package day_04/*
fun main () {
    println("Enter first number then second number: ")
    val num1 = readln().toIntOrNull() ?: 0
    val num2 = readln().toIntOrNull() ?: 0

    val sum = addition(num1, num2)

    println("The sum of the numbers is: $sum")
}

fun addition(num1: Int, num2: Int): Int {
    return num1 + num2
}
 */

fun main () {
    println("Enter first number then second number: ")
    val num1 = readln().toIntOrNull() ?: 0
    val num2 = readln().toIntOrNull() ?: 0

    addition(num1, num2)
}

fun addition(num1: Int, num2: Int) {
    val sum = num1 + num2
    println("The sum of the numbers is: $sum")
}