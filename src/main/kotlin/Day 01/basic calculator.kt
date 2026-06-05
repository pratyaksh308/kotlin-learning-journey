fun main(){
    println("Enter first number: ")
    val a = readln().toInt()
    println("Enter second number: ")
    val b = readln().toInt()

    val sum = a + b
    println("The sum is $sum")

    val diff = a - b
    println("The subtraction is $diff")

    val multiply = a * b
    println("The multiplication is $multiply")

    val divide = a / b
    println("The quotient is $divide")
}