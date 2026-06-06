package day_05

fun main (){
    println("Write the Title of the book and Author of that same book")
    val book = Book(readln(), readln())

    println("\n Book: ${book.bookTitle} (${book.author})")
}

class Book(val bookTitle: String, val author: String){}