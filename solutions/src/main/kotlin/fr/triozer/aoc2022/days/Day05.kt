package fr.triozer.aoc2022.days

import fr.triozer.aoc2022.utils.readInput

// #region other-container
private class Container {
    var stacks: MutableMap<Int, ArrayDeque<Char>> = mutableMapOf()

    fun add(index: Int, char: Char) {
        if (!stacks.containsKey(index)) stacks[index] = ArrayDeque()
        stacks[index]!!.add(char)
    }

    // #region added-for-part-1
    fun moveCrate9000(from: Int, count: Int, to: Int) {
        val toBeCopied = stacks[from]!!.subList(0, count)
        toBeCopied.forEach(stacks[to]!!::addFirst)
        toBeCopied.clear()
    }
    // #endregion added-for-part-1

    // #region added-for-part-2
    fun moveCrate9001(from: Int, count: Int, to: Int) {
        val toBeCopied = stacks[from]!!.subList(0, count)
        toBeCopied.reversed().forEach(stacks[to]!!::addFirst)
        toBeCopied.clear()
    }
    // #endregion added-for-part-2

    fun firsts() = stacks.toSortedMap()
        .map { it.value.first() }
        .joinToString("")
}

// #endregion other-container

// #region other-parse-container
private fun List<String>.toContainer(): Pair<Container, Int> {
    val container = Container()
    var lineIndex = 0 // it is used to keep a track of the current line index

    for (i in this.indices) {
        val line = this[i]
        lineIndex++

        if (line.isBlank()) break

        for (charIndex in 1 until line.length step 4) {
            var char = line[charIndex]

            if (!char.isLetter()) continue

            container.add(charIndex / 4, char)
        }
    }

    return Pair(container, lineIndex)
}
// #endregion other-parse-container

// #region other-parse-instructions
private fun List<String>.toInstructions(): List<List<Int>> = this
    .map {
        val regex = "move (\\d+) from (\\d+) to (\\d+)".toRegex()
        val matchResult = regex.find(it)

        matchResult!!.destructured.toList().map { n -> n.toInt() }
    }
// #endregion other-parse-instructions

// #region part1
private fun part1(input: List<String>): String {
    val (container, lineIndex) = input.toContainer()

    input.subList(lineIndex, input.size)
        .toInstructions()
        .forEach { (count, from, to) ->
            container.moveCrate9000(from - 1, count, to - 1)
        }

    return container.firsts()
}
// #endregion part1

// #region part2
private fun part2(input: List<String>): String {
    val (container, lineIndex) = input.toContainer()

    input.subList(lineIndex, input.size)
        .toInstructions()
        .forEach { (count, from, to) ->
            container.moveCrate9001(from - 1, count, to - 1)
        }

    return container.firsts()
}
// #endregion part2

private fun main() {
    val testInput = readInput(5, "test")
    check(part1(testInput) == "CMZ")
    check(part2(testInput) == "MCD")

    println("Checks passed ✅")

    val input = readInput(5, "input")
    println(part1(input))
    println(part2(input))
}
