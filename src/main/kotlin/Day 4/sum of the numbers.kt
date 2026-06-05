fun main() {
    println("Enter a number: ")
    val num = readln().toIntOrNull() ?: 0
    var sum = 0
    for (i in 1..num) {
        sum += (i)
    }
    println("Sum of the numbers is: $sum")
}