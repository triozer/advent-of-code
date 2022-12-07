# [Day 01: Calorie Counting](https://adventofcode.com/2022/day/1)

## Introduction

Inventories are separated by a line break. They must therefore be grouped, transformed into integers and added together.

### Input

<<< @/../../solutions/src/main/resources/2022/day1/test.in{txt}

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day01.kt#part1{2-3 kotlin}

The highlighted lines transforms the input into:

```
1000;2000;3000
4000
5000;6000
7000;8000;9000
10000
```

After the first step it's pretty simple to sum the values.

## Part 2

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day01.kt#part2{kotlin}

## Conclusion

Pretty simple day, I didn't have to think too much about it. I'm looking forward to the next days.

Difficulty: ⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day01.kt](https://github.com/triozer/aoc-2022/tree/main/solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day01.kt)

### Other solution

::: details After some time, I found this another way to solve the problem

```kotlin
private fun main() {
    val testInput = readInput(2022, 1, "test")
    val elfCalories = testInput
        .chunkedBy { it.isBlank() } // Use blank lines to separate inventories
        .map { carriedCalories ->
            carriedCalories.sumOf { it.toInt() }
        }
        .sortedDescending()

    check(elfCalories.first() == 24000)
    check(elfCalories.take(3).sum() == 45000) // take(3) is equivalent to subList(0, 3)
}
```

:::
