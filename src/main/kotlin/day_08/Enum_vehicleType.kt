package day_08

fun main() {
    val car = Car(name = "Progen T20", category = VehicleType.SUPER)

    println("${car.name} category is ${car.category}")
}

enum class VehicleType {
    SUPER, SPORTS, SUV, MUSCLE, TUNER
}

class Car(
    val name: String,
    val category: VehicleType
)
