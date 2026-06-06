package day_05

fun main() {
    val garages = listOf(
        Garage("Offic Garage 1", 20),
        Garage("Eclipse Elvid Garage", 50),
        Garage("Nightclub Garage", 30)
    )

    for(garage in garages) {
        println("Garage name: ${garage.garageName}")
        println("Vehicles: ${garage.vehicleCount} \n")
    }
}

class Garage(val garageName: String, val vehicleCount: Int){}