package day_05

fun main() {
    val students = listOf(
        Student("Om", "BCA"),
        Student("Jayant", "MCA"),
        Student("Ayush", "MBA")
    )

    for(student in students) {
        println("Name: ${student.name}")
        println("Course: ${student.course} \n")
    }
}

class Student(val name: String, val course: String){}