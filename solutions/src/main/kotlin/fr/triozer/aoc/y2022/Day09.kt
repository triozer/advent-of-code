package fr.triozer.aoc.y2022

import fr.triozer.aoc.utils.readInput
import kotlin.math.absoluteValue
import kotlin.math.sign

// #region other-type
private typealias IntPair = Pair<Int, Int>
// #endregion other-type

// #region other-parse-input
private fun parse(input: List<String>) = sequence {
    var x = 0
    var y = 0
    yield(IntPair(x, y))

    for (line in input) {
        val (direction, steps) = line.split(" ")

        repeat(steps.toInt()) {
            when (direction) {
                "L" -> x--
                "R" -> x++
                "U" -> y++
                "D" -> y--
            }
            yield(IntPair(x, y))
        }
    }
}
// #endregion other-parse-input

// #region other-follow
private fun Sequence<IntPair>.follow(): Sequence<IntPair> = scan(IntPair(0, 0)) { tail, head ->
    // returns the x, y distance between the two points
    val dx = head.first - tail.first
    val dy = head.second - tail.second

    when {
        // if the distance is less or equals to 1 nothing changes
        dx.absoluteValue <= 1 && dy.absoluteValue <= 1 -> tail
        // if the dy is greater than dx, then same line, we move the tail on the y-axis
        dx.absoluteValue < dy.absoluteValue -> IntPair(head.first, head.second - dy.sign)
        // if the dx is greater than dy, then same column, we move the tail on the x-axis
        dx.absoluteValue > dy.absoluteValue -> IntPair(head.first - dx.sign, head.second)
        // otherwise we move the tail on both axis (diagonally)
        else -> IntPair(head.first - dx.sign, head.second - dy.sign)
    }
}
// #endregion other-follow

// #region part1
private fun part1(input: List<String>) = parse(input).follow().toSet().size
// #endregion part1

// #region part2
private fun part2(input: List<String>): Int {
    var seq = parse(input)
    repeat(9) {
        seq = seq.follow()
    }
    return seq.toSet().size
}
// #endregion part2

fun main() {
    val testInput = readInput(2022, 9, "test")
    check(part1(testInput) == 13)
    check(part2(testInput) == 1)

    val testInput2 = readInput(2022, 9, "test2")
    check(part2(testInput2) == 36)

    println("Checks passed ✅")

    val input = readInput(2022, 9, "input")
    println(part1(input))
    println(part2(input))
}
