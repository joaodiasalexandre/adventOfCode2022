package day3

fun main() {
    val input = {}.javaClass.classLoader.getResource("Day3")?.readText()

    firstHalf(input)

    secondHalf(input)
}

private fun secondHalf(input: String?) {
    val sumBadges = input?.split("\n") //each line is an element, representing an elf
        ?.chunked(3) //join the elements (elves) into groups of three
        ?.map {
            it.map { s -> s.toList() }
                .findCommonItems()
        }
        ?.flatten()
        ?.sumOf { getPriority(it) }


    println("Puzzle's second half solution, which is the sum of the badges per group of three elves is $sumBadges")
}

private fun firstHalf(input: String?) {
    val sumPriorities = input?.split("\n") //each line is an element, representing a rucksack
        ?.map { it.chunked(it.length / 2) } //each element is split into two, representing compartments of the rucksack
        ?.map {
            it.map { s -> s.toList() }
                .findCommonItems()
        }
        ?.flatten()
        ?.sumOf { getPriority(it) }

    println("Puzzle's first half solution, which is the sum of the priority of the repeated items per rucksack is $sumPriorities")
}

fun getPriority(char: Char): Int =
    if (char.isUpperCase()) (char.code % 'A'.code) + 27
    else char.code % 'a'.code + 1


fun <T> List<List<T>>.findCommonItems(): List<T> =
    this.reduce {acc, item -> acc.intersect(item.toSet()).toList() }
















