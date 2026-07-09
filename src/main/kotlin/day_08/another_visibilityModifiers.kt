package day_08

fun main() {
    val dog = Dog()
    dog.showAge()
}

open class Animal(protected val age: Int)

class Dog : Animal(3) {
    fun showAge() {
        println("Dog age: $age")
    }
}
