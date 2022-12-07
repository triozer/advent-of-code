package fr.triozer.aoc.y2022

import fr.triozer.aoc.utils.readInput

// #region other
private enum class Action(val value: Int) {
    ROCK(1), PAPER(2), SCISSORS(3);

    companion object {
        fun from(value: String) = when (value) {
            "A", "X" -> ROCK
            "B", "Y" -> PAPER
            "C", "Z" -> SCISSORS
            else -> throw IllegalArgumentException("Unknown action: $value")
        }
    }

    // #region added-for-part-2
    fun beats() = when (this) {
        ROCK -> SCISSORS
        PAPER -> ROCK
        SCISSORS -> PAPER
    }

    fun beaten() = when (this) {
        ROCK -> PAPER
        PAPER -> SCISSORS
        SCISSORS -> ROCK
    }
    // #endregion added-for-part-2

    fun compare(other: Action): Int = when {
        this == other -> 3
        this == ROCK && other == SCISSORS -> 6
        this == PAPER && other == ROCK -> 6
        this == SCISSORS && other == PAPER -> 6
        else -> 0
    }
}
// #endregion other

// #region part1
private fun part1(input: List<String>) = input.fold(0) { acc, round ->
    val (player1, player2) = round.split(" ").map(Action.Companion::from)
    acc + player2.value + player2.compare(player1)
}
// #endregion part1

// #region part2
private fun part2(input: List<String>) = input.fold(0) { acc, round ->
    val (p1, goal) = round.split(" ")
    val player1 = Action.from(p1)

    // We define the action based on the goal
    val player2 = when (goal) {
        "X" -> player1.beats()
        "Y" -> player1
        else -> player1.beaten()
    }

    acc + player2.value + player2.compare(player1)
}
// #endregion part2

private fun main() {
    val testInput = readInput(2022, 2, "test")
    check(part1(testInput) == 15)
    check(part2(testInput) == 12)

    println("Checks passed ✅")

    val input = readInput(2022, 2, "input")
    println(part1(input))
    println(part2(input))
}
