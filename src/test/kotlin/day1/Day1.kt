package day1

import org.junit.jupiter.api.Test

class Day1 {

    private val input = this::class.java.getResource("Day1Input.txt")?.readText()!!

    @Test
    fun findMaxDelimitedByEmptyLine() {
        val regex = Regex.fromLiteral("\n\n")
        val output = input.split(regex)
            .map {
                it.split("\n")
                    .sumOf { value -> value.toInt() }
            }.sortedDescending()
            .subList(0,3)
            .sum()

        println(output)
    }
}