package day_05

fun main () {
    val movies = listOf(
        Movie("Interstellar", 2014),
        Movie("Your Name", 2016),
        Movie("Peaky Blinders: The Immortal Man", 2026),
        Movie("3 Idiots", 2009),
        Movie("Harry Potter and the Philosopher's Stone", 2001)
    )

    for (movie in movies) {
        println(movie)
    }
}

data class Movie (val title: String, val year: Int) {}