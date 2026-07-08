package day_07

fun main() {
    val characters: List<Character> = listOf(Michael(), Franklin(), Trevor())

    for (character in characters) {
        character.showInfo()
        character.name()
        character.health()
        character.specialAbility()
        println() 
    }
}

interface Character {
    fun showInfo() {
        println("Here's the info of the character: ")
    }
    fun name()
    fun health()
    fun specialAbility()
}

class Michael : Character {
    override fun name() {
        println("Name- Michael")
    }
    override fun health() {
        println("Health- 100")
    }
    override fun specialAbility() {
        println("Special Ability- Bullet Time")
    }
}

class Franklin : Character {
    override fun name() {
        println("Name- Franklin")
    }
    override fun health() {
        println("Health- 100")
    }
    override fun specialAbility() {
        println("Special Ability- Driving Focus")
    }
}

class Trevor : Character {
    override fun name() {
        println("Name- Trevor")
    }
    override fun health() {
        println("Health- 100")
    }
    override fun specialAbility() {
        println("Special Ability- Rage Mist")
    }
}
