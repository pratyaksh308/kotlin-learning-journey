package day_07

fun main() {
    val michael = Michael()
    michael.showInfo()
    michael.name()
    michael.health()
    michael.specialAbility()

    val franklin = Franklin()
    franklin.showInfo()
    franklin.name()
    franklin.health()
    franklin.specialAbility()

    val trevor = Trevor()
    trevor.showInfo()
    trevor.name()
    trevor.health()
    trevor.specialAbility()
}

abstract class Character{
    open fun showInfo(){
        println("Here's the info of the character: ")
    }
    abstract fun name()
    abstract fun health()
}

class Michael : Character() {
    override fun name() {
        println("Name- Michael")
    }
    override fun health() {
        println("Health- 100")
    }
    fun specialAbility() {
        println("Special Ability- Bullet Time\n")
    }
}

class Franklin : Character() {
    override fun name() {
        println("Name- Franklin")
    }
    override fun health() {
        println("Health- 100")
    }
    fun specialAbility() {
        println("Special Ability- Driving Focus\n")
    }
}

class Trevor : Character() {
    override fun name() {
        println("Name- Trevor")
    }
    override fun health() {
        println("Health- 100")
    }
    fun specialAbility() {
        println("Special Ability- Rage Mist")
    }
}