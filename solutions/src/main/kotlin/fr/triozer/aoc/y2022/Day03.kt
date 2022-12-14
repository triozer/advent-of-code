package fr.triozer.aoc.y2022

import fr.triozer.aoc.utils.readInput

// #region part1
private fun part1(input: List<String>): Int = input.sumOf {
    val (first, second) = it.chunked(it.length / 2)
    val item = first.filter { c -> second.contains(c) }[0]

    if (item.isUpperCase()) {
        item.code - 'A'.code + 27
    } else {
        item.code - 'a'.code + 1
    }
}
// #endregion part1

// #region part2
private fun part2(input: List<String>) = input.windowed(3, 3).sumOf {
    val (first, second, third) = it
    val badge = first.filter { c -> second.contains(c) && third.contains(c) }[0]

    if (badge.isUpperCase()) {
        badge.code - 'A'.code + 27
    } else {
        badge.code - 'a'.code + 1
    }
}
// #endregion part2

private fun main() {
    val testInput = readInput(2022, 3, "test")
    check(part1(testInput) == 157)
    check(part2(testInput) == 70)

    println("Checks passed ✅")

    val input = readInput(2022, 3, "input")
    println(part1(input))
    println(part2(input))
}
