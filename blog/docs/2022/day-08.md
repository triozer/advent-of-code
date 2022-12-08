# [Day 08: Treetop Tree House](https://adventofcode.com/2022/day/8)

::: warning
For today, I'm trying to use [ChatGPT](https://chat.openai.com) to generate the blog post. I'm not sure how well it
will work, but I'm excited to try it out!
:::

## Introduction

This code looks like it's solving a problem where you're given a list of strings representing a grid of numbers, and you
need to find the total number of cells in the grid that satisfy certain conditions.

### Input

<<< @/../../solutions/src/main/resources/2022/day8/test.in{txt}

## Part 1

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day08.kt#part1{kotlin}

This code is counting the number of adjacent cells of a 2D array, given an input. It does this by looping through the
indices of the input array, and for each index, looping through the indices of the corresponding row of the array. For
each index, the code creates four lists containing all the adjacent cells, one for each side (left, right, up, down). It
then counts the number of cells in these lists, and returns the sum of this count.

## Part 2

<<< @/../../solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day08.kt#part2{kotlin}

This code is finding the maximum number of trees a person can travel through on a 2D map. The input is a list of strings
that represent the map, and each character in the string corresponds to a different type of terrain. The person can only
move through the terrain if it is lower than the terrain they are currently on. The code is looping through each
character of the input strings, and then looping through all the adjacent characters to calculate the maximum number
of trees they can move through starting from that character. It calculates the number of trees by taking the minimum of
the number of trees in the adjacent terrain that is lower than the current terrain, plus one. It then multiplies this
number by the number of trees in all the other adjacent terrain.

## Conclusion

Cool day! I had time to clean up a bit my code, the first iteration was too horrible to show to anyone.

Difficulty: ⭐️⭐️ / ⭐️⭐️⭐️⭐️⭐️\
Source
code: [Day08.kt](https://github.com/triozer/aoc-2022/blob/main/solutions/src/main/kotlin/fr/triozer/aoc/y2022/Day08.kt)
