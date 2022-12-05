# [Day 05](https://adventofcode.com/2022/day/5)

## Introduction

We have to move some items between stacks.

### Input

<<< @/../../solutions/src/main/resources/day5/test.in{txt}

### Other

::: details Click to view Container
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day05.kt#other-container{kotlin}
:::

::: details Click to view List\<String\>#toContainer
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day05.kt#other-parse-container{kotlin}
:::

::: details Click to view List\<String\>#toInstructions
<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day05.kt#other-parse-instructions{kotlin}
:::

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day05.kt#part1{kotlin}

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day05.kt#added-for-part-1{kotlin}

Due to `stacks[from]` being
an [`ArrayDeque`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-deque/), the sublist will keep
the FILO (First In Last Out) order.

Moving a subset of the queue is the same as moving each element one by one.

## Part 2

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day05.kt#part2{kotlin}

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day05.kt#added-for-part-2{3 kotlin}

For the same reason as in part one, we can use
the [`reversed`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reversed.html) method to reverse the
sublist and get the "natural" order of the elements.

Moving a subset of the reversed queue is the same as moving the whole queue.

## Conclusion

This one was a bit trickier due to the parsing of the instructions. Once the parsing done, it was easy to relay
on [`ArrayDeque`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-array-deque/) as the data structure
for the container.

Difficulty: ⭐️⭐️⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day05.kt](https://github.com/triozer/aoc-2022/tree/main/solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day05.kt)
