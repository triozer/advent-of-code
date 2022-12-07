# [Day 07: No Space Left On Device](https://adventofcode.com/2022/day/7)

## Introduction

We have to parse a "tree-file" and then recursively explore it.

### Input

<<< @/../../solutions/src/main/resources/2022/day7/test.in{txt}

### Other

::: details Click to view File
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day07.kt#other-file{kotlin}
:::

::: details Click to view parseTree
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day07.kt#other-parse{kotlin}
:::

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day07.kt#part1{6-11 kotlin}

## Part 2

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day07.kt#part2{7-12 kotlin}

## Conclusion

I think for this one, the hardest part was parsing the input. Playing with recursion is always fun.\
I could have probably saved a lot of time by just doing it without using a class, but I'm not doing it for grading (I
started too late anyway), maybe next year? 😁

Difficulty: ⭐️⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day07.kt](https://github.com/triozer/aoc-2022/blob/main/solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day07.kt)
