# [Day 01: Calorie Counting](https://adventofcode.com/2022/day/1)

## Introduction

Inventories are separated by a line break. They must therefore be grouped, transformed into integers and added together.

### Input

<<< @/../../solutions/src/main/resources/day1/test.in{txt}

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day01.kt#part1{2-3 kotlin}

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

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day01.kt#part2{kotlin}

## Conclusion

Pretty simple day, I didn't have to think too much about it. I'm looking forward to the next days.

Difficulty: ⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day01.kt](https://github.com/triozer/aoc-2022/tree/main/solutions/src/main/kotlin/fr/triozer/aoc2022/days/Day01.kt)
