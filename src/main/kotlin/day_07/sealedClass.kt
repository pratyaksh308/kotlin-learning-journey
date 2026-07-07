package day_07

fun main() {
    val result: GameResult = GameResult.Win

    val message = when (result) {
        is GameResult.Win -> "Your won the game!"
        is GameResult.Lose -> "You lost, better luck next time."
        is GameResult.Draw -> "It's a draw"
    }
    println(message)
}

sealed class GameResult {
    object Win : GameResult()
    object Lose : GameResult()
    object Draw : GameResult()
}
