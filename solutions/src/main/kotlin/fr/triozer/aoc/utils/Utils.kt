package fr.triozer.aoc.utils

import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input.in txt file.
 */
fun readInput(year: Int, day: Int, name: String) =
    File("solutions/src/main/resources/$year/day$day", "$name.in").readLines()

/**
 * Read lines from the given input.in txt file as a list of int
 */
fun readInputAsInt(year: Int, day: Int, name: String) = readInput(year, day, name).map { it.toInt() }

/**
 * Converts string to fr.triozer.aoc/y2022.fr.triozer.aoc.utils.md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')
