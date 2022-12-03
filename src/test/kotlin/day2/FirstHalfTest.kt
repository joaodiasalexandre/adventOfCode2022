package day2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FirstHalfTest {

    @Test
    fun `should calculate wins`(){
        val rockVSscissors = Round(Rock, Scissors)
        val paperVSrock = Round(Paper, Rock)
        val scissorsVSpaper = Round(Scissors, Paper)

        Assertions.assertEquals(7, rockVSscissors.score())
        Assertions.assertEquals(8, paperVSrock.score())
        Assertions.assertEquals(9, scissorsVSpaper.score())
    }

}