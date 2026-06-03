fun main() {
    println("Enter a number: ")
    val num = readln().toInt()

    when(num) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Enter a valid number!")
}   }