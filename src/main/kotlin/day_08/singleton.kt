package day_08

fun main () {
    println("Enter first number: ")
    val a = readln().toIntOrNull() ?: 0
    println("Enter second number: ")
    val b = readln().toIntOrNull() ?: 0

    println("Sum of $a and $b is ${Calculator.add(a,b)}")
}

object Calculator{
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}