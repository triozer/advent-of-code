# [Day 02: Rock Paper Scissors](https://adventofcode.com/2022/day/2)

## Introduction

We have to calculate the **total count** based on the following:

::: info Representation
- `A` & `X` represents `Rock` and are worth `1` point
- `B` & `Y` represents `Paper` and are worth `2` points
- `C` & `Z` represents `Scissors` and are worth `3` points
:::

::: info The score for each round is calculated as follows:
- The point value of the shape you selected
- A loss is worth `0` points
- A draw is worth `3` points
- A win is worth `6` points
:::

### Input

<<< @/../../solutions/src/main/resources/2022/day2/test.in{txt}

### Other

::: details Click to view Action enum
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day02.kt#other{kotlin}
:::

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day02.kt#part1{kotlin}

## Part 2

Now, the second column now decides the winner.

::: info Representation
- `X` you need to loose
- `Y` you need to draw
- `Z` you need to win
:::

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day02.kt#added-for-part-2{kotlin}

I added two new methods to the `Action` enum:
  - `beats`: returns the Action that can beat the current one
  - `beaten`: returns the Action that can be beaten by the current one

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day02.kt#part2{kotlin}

## Conclusion

Not a hard one but the statement was a bit overwhelming at first. I had to read it multiple times to understand what was
expected.

Difficulty:️ ⭐️⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day02.kt](https://github.com/triozer/aoc-2022/tree/main/solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day02.kt)
