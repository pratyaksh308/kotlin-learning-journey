package day_03

fun main() {
    val cars = arrayOf(
        "Progen T20",
        "Benefactor Krieger",
        "Truffade Nero Custom",
        "Grotti Turismo Classic",
        "Grotti Torrero XO"
    )

    println("List of Available Cars: ")
    println(cars.joinToString("\n"))

    println("\n")

    println("Which car do you want?")
    val customersPreference = readln()

    if(cars.any {it.equals(customersPreference, ignoreCase = true)}) println("We have that car available")
    else println("We dont have that car availabe OR try chekking the spelling")

}