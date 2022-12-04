package fr.triozer.aoc2022.utils

import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input.in txt file.
 */
fun readInput(day: Int, name: String) = File("src/main/resources/day$day", "$name.in").readLines()

/**
 * Read lines from the given input.in txt file as a list of int
 */
fun readInputAsInt(day: Int, name: String) = readInput(day, name).map { it.toInt() }

/**
 * Converts string to fr.triozer.aoc2022.utils.md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')
