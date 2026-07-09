package day_08

fun main() {
    println("Difficulty is ${GameSettings.difficulty()}")
}

object GameSettings {
    fun difficulty(): String {
        return "Hard"
    }
}