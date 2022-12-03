package day2

fun main() {
    val input = {}.javaClass.classLoader.getResource("Day2")?.readText()

    val rounds = input?.split("\n")
        ?.map { it.split(" ") }

    puzzleFirstHalf(rounds)

    puzzleSecondHalf(rounds)

}

private fun puzzleSecondHalf(rounds: List<List<String>>?) {
    val secondHalfScore = rounds?.sumOf {
        secondHalfLogic(it).score()
    }

    println(
        "Puzzle's second half, where:\n" +
                "X is Losing\n" +
                "Y is Drawing\n" +
                "Z is Winning\n" +
                "Total score: $secondHalfScore"
    )
}

private fun puzzleFirstHalf(rounds: List<List<String>>?) {
    val firstHalfScore = rounds?.sumOf {
        firstHalfLogic(it).score()
    }

    println(
        "Puzzle's first half, where:\n" +
                "X is Rock\n" +
                "Y is Paper\n" +
                "Z is Scissors\n" +
                "Total score: $firstHalfScore\n" +
                "-------------------------------------------------------------------------------"
    )
}


fun firstHalfLogic(list: List<String>): Round {
    val codeToMove = mapOf(
        PlayerCodes.X to Rock,
        PlayerCodes.Y to Paper,
        PlayerCodes.Z to Scissors,
    )

    return Round(
        codeToMove.getValue(PlayerCodes.from(list[1])),
        from(list[0]))
}

fun secondHalfLogic(list: List<String>) : Round {
    val opponentMove = from(list[0])

    val playerMove = when (PlayerCodes.from(list[1])) {
        PlayerCodes.X -> opponentMove.beats
        PlayerCodes.Y -> opponentMove
        PlayerCodes.Z -> opponentMove.isBeatenBy
    }

    return Round(playerMove, opponentMove)
}















