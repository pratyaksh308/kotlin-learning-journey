package day_04

fun main() {
    val pass = "gta123"
    var input =""

    while (input != pass){
        print("Enter The Password: ")
        input = readln()
    }
    println("Access Granted!")
}