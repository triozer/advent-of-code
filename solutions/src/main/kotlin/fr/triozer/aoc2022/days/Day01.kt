package fr.triozer.aoc2022.days

import fr.triozer.aoc2022.utils.readInput

private fun part1(input: List<String>): Int {
    return input.joinToString(";")
        .split(";;")
        .maxOf { carriedCalories ->
            carriedCalories.split(";").sumOf { it.toInt() }
        }
}

private fun part2(input: List<String>): Int {
    return input.joinToString(";")
        .split(";;")
        .map { carriedCalories ->
            carriedCalories.split(";").sumOf { it.toInt() }
        }
        .sortedDescending().subList(0, 3)
        .sum()
}

private fun main() {
    val testInput = readInput(1, "test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    println("Checks passed ✅")

    val input = readInput(1, "input")
    println(part1(input))
    println(part2(input))
}