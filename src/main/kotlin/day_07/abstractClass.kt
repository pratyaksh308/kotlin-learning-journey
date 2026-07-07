package day_07

fun main() {
    val dog = Dog()
    dog.showInfo()
    dog.name()
    dog.age()
    dog.makeSound()

    val cat = Cat()
    cat.showInfo()
    cat.name()
    cat.age()
    cat.makeSound()
}

abstract class Animal {
    abstract fun name()
    abstract fun age()
    open fun showInfo() {
        println("Here's the info of the animal: ")
    }
}

class Dog : Animal() {
    override fun name() {
        println("Dog's name is Shiro")
    }
    override fun age() {
        println("Shiro is 2 years old.")
    }
    fun makeSound() {
        println("Shiro barks\n")
    }
}

class Cat : Animal() {
    override fun name() {
        println("Cat's name is Miko")
    }
    override fun age() {
        println("Miko is 4 years old.")
    }
    fun makeSound() {
        println("Miko meows")
    }
}