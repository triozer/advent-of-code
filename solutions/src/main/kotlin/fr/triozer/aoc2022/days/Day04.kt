package fr.triozer.aoc2022.days

import fr.triozer.aoc2022.utils.readInput

// #region part1
private fun part1(input: List<String>) = input.count {
    val (start1, end1, start2, end2) = it
        .split(",")
        .flatMap { pair ->
            pair.split("-").map { n -> n.toInt() }
        }
    val (start, end) = start1..end1 to start2..end2

    start.toList().containsAll(end.toList()) || end.toList().containsAll(start.toList())
}
// #endregion part1

// #region part2
private fun part2(input: List<String>) = input.count {
    val (start1, end1, start2, end2) = it
        .split(",")
        .flatMap { pair ->
            pair.split("-").map { n -> n.toInt() }
        }

    (start1 in start2..end2) || (end1 in start2..end2)
            || (start2 in start1..end1) || (end2 in start1..end1)
}
// #endregion part2

private fun main() {
    val testInput = readInput(4, "test")
    check(part1(testInput) == 2)
    check(part2(testInput) == 4)

    println("Checks passed ✅")

    val input = readInput(4, "input")
    println(part1(input))
    println(part2(input))
}
