package day_03

fun main () {
    println("Enter Name of the Student: ")
    val studentName = readln()

    println("\nEnter marks of the 3 subjects: ")

    println("Maths: ")
    val maths = readln().toIntOrNull() ?: 0
    println("Science: ")
    val science = readln().toIntOrNull() ?: 0
    println("English: ")
    val english = readln().toIntOrNull() ?: 0

    println("\nStudent Name - $studentName")

    val totalMarks = maths + science + english
    println("Total Marks - $totalMarks")

    /*
    when {
        totalMarks >= 250 -> println("Grade - A")
        totalMarks >= 200 -> println("Grade - B")
        totalMarks >= 150 -> println("Grade - C")
        totalMarks >= 100 -> println("Grade - D")
        else -> println("Fail")
    }
    */

    if(totalMarks >= 250) println("Grade - A")
    else if(totalMarks >= 200) println("Grade - B")
    else if(totalMarks >= 150) println("Grade - C")
    else if(totalMarks >= 100) println("Grade - D")
    else println("Fail")
}