fun main () {
    println("Enter Name of the Student: ")
    val studentName = readln()

    println("\nEnter marks of the 3 subjects: ")

    println("Maths: ")
    val maths = readln().toInt()
    println("Science: ")
    val science = readln().toInt()
    println("English: ")
    val english = readln().toInt()

    println("\nStudent Name - $studentName")

    val totalMarks = maths + science + english
    println("Total Marks - $totalMarks")

    if(totalMarks >= 100) println("Pass")
    else println("Fail")
}