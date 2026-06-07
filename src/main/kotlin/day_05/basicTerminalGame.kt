package day_05

import kotlin.system.exitProcess

fun main() {
    val michael = GameCharacter("Michael", 100)

    println("This is a Terminal Game")
    println("-------------------------\n")
    println("About the game: Its a 1v1 between you and Michael(gameCharacter)")
    println("you both can attack each other alternatively and can heal")
    println("only +20 hp after getting every hit and both will start at a hp of 100.")
    println("Last One Standing Wins!\n")

    println("Choose an option:")
    println("1. Start")
    println("2. Exit")
    var menuInput = readln().toIntOrNull() ?: 0

    while (menuInput != 1 && menuInput !=2) {
        println("Enter a valid option (1 or 2")
        menuInput = readln().toIntOrNull() ?: 0
    }

    if (menuInput == 2) {
        println("Exiting the terminal game.....")
        exitProcess(0)
    }

    println("Enter your character's name: ")
    val userCharacterName = readln()
    val player = GameCharacter(userCharacterName, 100)

    println("Choose your weapon:")
    println("1. Fist (power: 25)")
    println("Your other weapons are not yet unlocked.")
    var weaponChoice = readln().toIntOrNull() ?: 0

    while (weaponChoice != 1) {
        println("Choose an unlocked weapon (1):")
        weaponChoice = readln().toIntOrNull() ?: 0
    }

    println("\nBuilding the Arena.....")
    Thread.sleep(2000)
    println("       FIGHT!!\n")
    Thread.sleep(1000)

    while (player.health > 0 && michael.health >0) {
        println("---------------------------------")
        println("Your HP: ${player.health}    |    Michael's HP: ${michael.health}")
        println("Choose your action:")
        println("1. Attack")
        println("2. Heal")

        val playerChoice = readln().toIntOrNull() ?: 0
        when (playerChoice) {
            1 -> player.attack(michael)
            2 -> player.heal()
            else -> println("Invalid choice, turn skipped!")
        }

        if (michael.health <= 0) {
            println("\nCongratulations ${player.name}, you are the winner!")
            break
        }

        Thread.sleep(1000)

        val shouldHeal = michael.health < 50 && (1..2).random() == 1
        if (shouldHeal) {
            michael.heal()
        } else {
            michael.attack(player)
        }

        if (player.health <= 0){
            println("\n${michael.name} has defeated you. Game Over.")
            break
        }
        Thread.sleep(1000)
    }
}


class GameCharacter (val name : String, var health : Int){
    val weaponPower = 25

    fun attack(opponent: GameCharacter){
        println("\n>>> $name attacks ${opponent.name}!")
        damageType(weaponPower)
        opponent.takeDamage(weaponPower)
    }

    fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0){
            health = 0
            println("<<<${name}'s health is now 0. $name has been defeated!")
        } else {
            println("<<< $name's health is now $health")
        }
    }

    fun heal(){
       if (health >= 100){
           println(">>> $name tried to heal but is already at full health!")
           return
       }
       val startingHealth = health
        health += 20
        if (health > 100) {health = 100}
        println("\n>>> $name heals for ${health - startingHealth} HP. Health is now $health")
    }

    val damageType = {weaponPower: Int ->
        if (weaponPower > 40) println("Critical damage")
        else println("Normal Hit")
    }
}