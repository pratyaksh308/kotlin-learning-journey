package day_07

fun main () {
    val player = Player()
    player.attack()

    val zombie = Zombie()
    zombie.attack()
}

interface Attackable {
    fun attack()
}

class Player : Attackable {
    override fun attack(){
        println("Player attacks Zombie with a knife")
    }
}

class Zombie : Attackable {
    override fun attack() {
        println("Zombie attacks Player with bite")
    }
}