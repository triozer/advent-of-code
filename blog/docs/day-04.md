# [Day 04: Camp Cleanup](https://adventofcode.com/2022/day/4)

## Introduction

We have to count how pair of range are fully merged.

### Input

<<< @/../../solutions/src/main/resources/day4/test.in{txt}

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day04.kt#part1{3-6 kotlin}

The highlighted lines are the ones that are important for this part. In the end we have:

```kotlin
[2, 4, 6, 8]
[2, 3, 4, 5]
[5, 7, 7, 9]
[2, 8, 3, 7]
[6, 6, 4, 6]
[2, 6, 4, 8]
```

After that we just need to check that all the elements in the first range are in the second one.

## Part 2

Same principle as part 1, but here we just need to check if they overlap.

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day04.kt#part2{kotlin}

## Conclusion

A bit tricky as I was trying to
use [`IntRange`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-int-range/index.html).

Difficulty:️ ⭐️⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day04.kt](https://github.com/triozer/aoc-2022/tree/main/solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day04.kt)
