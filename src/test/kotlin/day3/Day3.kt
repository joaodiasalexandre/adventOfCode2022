package day3

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Day3 {

    @Test
    fun `should get correct priority`(){
        Assertions.assertEquals(27, getPriority('A'))
        Assertions.assertEquals(52, getPriority('Z'))
        Assertions.assertEquals(1, getPriority('a'))
        Assertions.assertEquals(26, getPriority('z'))
    }

}