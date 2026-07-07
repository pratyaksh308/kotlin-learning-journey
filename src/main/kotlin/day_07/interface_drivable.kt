package day_07

fun main () {
    val car = Car()
    car.drive()

    val bike = Bike()
    bike.drive()

    val truck = Truck()
    truck.drive()
}

interface Drivable {
    fun drive()
}

class Car : Drivable{
    override fun drive(){
        println("Car is driving on the road.")
    }
}

class Bike : Drivable{
    override fun drive(){
        println("Bike is speeding through traffic.")
    }
}

class Truck : Drivable{
    override fun drive(){
        println("Truck is carrying cargo.")
    }
}