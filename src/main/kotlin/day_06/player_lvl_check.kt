package day_06

fun main() {
    println("Enter Player's level: ")
    var lvl = readln().toIntOrNull() ?: 0

    while(lvl <= 0){
        println("Enter a valid level:")
        lvl = readln().toIntOrNull() ?: 0
    }

    if(lvlCheck(lvl)) println("Pro Player")
    else println("Beginner")
}

val lvlCheck = { lvl: Int ->
    lvl > 50
}