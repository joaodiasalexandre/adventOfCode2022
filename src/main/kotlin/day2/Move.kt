package day2

val codeToMove = mapOf(
    "A" to Rock,
    "B" to Paper,
    "C" to Scissors,
)

fun from(code: String): Move = codeToMove.getValue(code)

interface Move {
    val isBeatenBy: Move
    val beats: Move
    val score: Int

    fun beats(move: Move): Result {
        if(this.beats == move) return Win
        return if(this.isBeatenBy == move) Lose
        else Draw
    }
}

object Rock: Move{
    override val isBeatenBy: Move = Paper
    override val beats: Move = Scissors
    override val score: Int = 1

}

object Paper: Move{
    override val isBeatenBy: Move = Scissors
    override val beats: Move = Rock
    override val score: Int = 2
}

object Scissors: Move{
    override val isBeatenBy: Move = Rock
    override val beats: Move = Paper
    override val score: Int = 3
}








