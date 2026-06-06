package day_05

fun main () {
    val car1 = Car(name = "Progen T20", topSpeed = 220)
    val car2 = Car(name = "Benefactor Krieger", topSpeed = 250)
    val car3 = Car(name = "Truffade Nero", topSpeed = 240)

    println("Car 1: ${car1.name}")
    println("Top speed: ${car1.topSpeed} \n")

    println("Car 2: ${car2.name}")
    println("Top speed: ${car2.topSpeed} \n")

    println("Car 3: ${car3.name}")
    println("Top speed: ${car3.topSpeed} \n")
}

class Car(
    val name: String,
    val topSpeed: Int
)