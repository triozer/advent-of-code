package fr.triozer.aoc.y2022

import fr.triozer.aoc.utils.readInput

// #region part1
private fun part1(input: List<String>) = input.map { line ->
    line
        .windowed(4)
        .indexOfFirst { it.toSet().size == 4 } + 4
}
// #endregion part1

// #region part2
private fun part2(input: List<String>) = input.map { line ->
    line
        .windowed(14)
        .indexOfFirst { it.toSet().size == 14 } + 14
}
// #endregion part2

private fun main() {
    val testInput = readInput(2022, 6, "test")
    check(part1(testInput) == listOf(7, 5, 6, 10, 11))
    check(part2(testInput) == listOf(19, 23, 23, 29, 26))

    println("Checks passed ✅")

    val input = readInput(2022, 6, "input")
    println(part1(input))
    println(part2(input))
}
