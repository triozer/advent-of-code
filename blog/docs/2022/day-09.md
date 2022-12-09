# [Day 09: Rope Bridge](https://adventofcode.com/2022/day/9)

::: warning
:warning: This page is a work in progress.
:::

## Introduction

We have to move the tail in order to follow the head.

### Input

<<< @/../../solutions/src/main/resources/2022/day9/test.in{txt}

We were provided with another test input, for the part 2.

<<< @/../../solutions/src/main/resources/2022/day9/test2.in{txt}

### Other

::: details Click to view IntPair
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day09.kt#other-type{kotlin}
:::

::: details Click to view parse(input: List\<String\>)
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day09.kt#other-parse-input{kotlin}
:::

::: details Click to view Sequence\<IntPair>.follow()
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day09.kt#other-follow{kotlin}
:::

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day09.kt#part1{kotlin}

## Part 2

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day09.kt#part2{kotlin}

## Conclusion

Pretty hard one, my first attempt worked (~30mn) but it was waaaayyyy to slow. I had to optimize it a lot, and I'm still
not sure if it's the best way to do it.

Difficulty: ⭐️⭐️⭐️⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day09.kt](https://github.com/triozer/aoc-2022/blob/main/solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day09.kt)
