# [Day 03: Rucksack Reorganization](https://adventofcode.com/2022/day/3)

## Introduction

We have to get the common item in a rucksack.

::: info Item

- `[a-z]` have priority going from `1` to `26`
- `[A-Z]` have priority going from `27` to `52`
  :::

::: info Ruckstack

- Each line is a rucksack
- Each rucksack is composed of two compartments of the same size
- An item can only be in one compartment
  :::

### Input

<<< @/../../solutions/src/main/resources/day3/test.in{txt}

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day03.kt#part1{2 kotlin}

[`chunked`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/chunked.html) will split each line into two
parts of the given size. The output will looks like:

```kotlin
["vJrwpWtwJgWr", "hcsFMMfFFhFp"]
["jqHRNqRjqzjGDLGL,rsFMfFZSrLrFZsSL"]
["PmmdzqPrV,vPwwTWBwg"]
["wMqvLMZHhHMvwLH", "jbvcjnnSBnvTQFn"]
["ttgJtRGJ", "QctTZtZT"]
["CrZsJsPPZsGz", "wwsLwLmpwMDw"]
```

## Part 2

Now we need to look at group of ruckstacks and find the common badge.

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day03.kt#part2{1 kotlin}

[`windowed`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/windowed.html) will group each line into a
list of 3. The output will looks like:

```kotlin
["vJrwpWtwJgWrhcsFMMfFFhFp", "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL", "PmmdzqPrVvPwwTWBwg"]
["wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn", "ttgJtRGJQctTZtZT", "CrZsJsPPZsGzwwsLwLmpwMDw"]
```

## Conclusion

Easy one, thanks to Kotlin's [`chunked`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/chunked.html)
and [`windowed`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/windowed.html) functions.
You just need to get your calculations right 🥹.

Difficulty:️ ⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day03.kt](https://github.com/triozer/aoc-2022/tree/main/solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day03.kt)
