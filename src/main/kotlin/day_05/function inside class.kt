package day_05

fun main () {

    val player1 = Player("Michael", 57)
    val player2 = Player("Trevor", 65)
    val player3 = Player("Franklin", 41)

    player1.showInfo()
    player2.showInfo()
    player3.showInfo()
}

class Player(val name: String, var level: Int) {
    fun showInfo(){
        println("Name: $name")
        println("Level: $level \n")
    }
}