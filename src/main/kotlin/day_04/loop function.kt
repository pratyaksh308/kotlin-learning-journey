package day_04

fun main () {
    val num = 5

    printNumbers(num)
}

fun printNumbers(num: Int) {
    for(i in 1..num) {
        println(i)
    }
}