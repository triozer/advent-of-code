package fr.triozer.aoc.y2022

import fr.triozer.aoc.utils.readInput

// #region other-file
private class File {
    val parent: File?
    val name: String
    val size: Int

    val isFolder: Boolean
    val children: MutableList<File> = mutableListOf()

    constructor(parent: File?, name: String, size: Int) {
        this.parent = parent
        this.name = name
        this.size = size
        this.isFolder = false
    }

    constructor(parent: File?, name: String) {
        this.parent = parent
        this.name = name
        this.size = 0
        this.isFolder = true
    }

    fun add(file: File) {
        children.add(file)
    }

    fun cd(path: String): File {
        if (path == "..") {
            return parent!!
        }

        if (path == "/") {
            var root = this
            while (root.parent != null) {
                root = root.parent!!
            }
            return root
        }

        return children.find { it.isFolder && it.name == path }!!
    }

    fun size(): Int {
        return if (isFolder) {
            children.sumOf { it.size() }
        } else {
            size
        }
    }

    override fun toString(): String {
        return if (isFolder) {
            val sb = StringBuilder("$name (folder, ${size()}, ${children.size} children)\n")
            children.joinToString("\n") { it.toString() }.lines().forEach {
                sb.append("  $it\n")
            }
            sb.toString().trim()
        } else {
            "$name (file, $size)"
        }
    }
}
// #endregion other-file

// #region other-parse
private fun List<String>.parseTree(root: File): File {
    var mRoot = root

    forEach {
        val args = it.split(" ")

        if (args[0].startsWith("$")) {
            when (args[1]) {
                "cd" -> {
                    mRoot = mRoot.cd(args[2])
                }

                "ls" -> {}
                else -> {
                    println("Unknown command: ${args[1]}")
                }
            }
        } else {
            if (args[0] == "dir") {
                mRoot.add(File(mRoot, args[1]))
            } else {
                mRoot.add(File(mRoot, args[1], args[0].toInt()))
            }
        }
    }

    return root
}
// #endregion other-parse

// #region part1
private fun part1(input: List<String>): Int {
    val root = input.parseTree(File(null, "/"))

    var totalSize = 0
    fun calculate(file: File) {
        val size = file.size()
        if (file.isFolder && size <= 100000) {
            totalSize += size
        }

        file.children.forEach { calculate(it) }
    }
    calculate(root)

    return totalSize
}
// #endregion part1

// #region part2
private fun part2(input: List<String>): Int {
    val root = input.parseTree(File(null, "/"))
    val unusedSpace = 70000000 - root.size()

    val folders = mutableListOf<Int>()
    fun calculate(file: File) {
        val size = file.size()
        if (file.isFolder && unusedSpace + size > 30000000) {
            folders.add(size)
        }

        file.children.forEach { calculate(it) }
    }
    calculate(root)

    return folders.minByOrNull { it }!!
}
// #endregion part2

private fun main() {
    val testInput = readInput(2022, 7, "test")
    check(part1(testInput) == 95437)
    check(part2(testInput) == 24933642)

    println("Checks passed ✅")

    val input = readInput(2022, 7, "input")
    println(part1(input))
    println(part2(input))
}
