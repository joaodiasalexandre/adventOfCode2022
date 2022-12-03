package day2

class Round (
    private val player: Move,
    private val opponent: Move) {

    fun score(): Int = player.score + player.beats(opponent).score
}