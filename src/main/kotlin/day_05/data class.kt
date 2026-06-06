package day_05

fun main() {
    val phone1 = Phone("iPhone", "17 Pro Max", 149900f)
    val phone2 = Phone("Samsung", "S25 Ultra", 92895f)
    val phone3 = Phone("IQOO", "IQOO 15", 79999f)

    println(phone1)
    println(phone2)
    println(phone3)
}

data class Phone(
    val brand: String,
    val model: String,
    val price: Float
    ) {}