package day_06

fun main () {
    println("Enter first number:")
    val num1 = readln().toIntOrNull() ?: 0

    println("Enter second number:")
    val num2 = readln().toIntOrNull() ?: 0

    println("Sum of the two numbers: ${add(num1, num2)}")
}

val add = { num1: Int, num2: Int ->
    num1 + num2
}