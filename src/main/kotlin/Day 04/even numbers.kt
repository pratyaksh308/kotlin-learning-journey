fun main() {

    println("Even numbers from 2 t0 20: ")

    for (i in 2..20 step 2) {
        println(i)
    }

    for (i in 2..20) {
        if (i % 2 == 0) println(i)
    }
}