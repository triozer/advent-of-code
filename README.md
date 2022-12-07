# [aoc-2022](https://aoc.triozer.fr)

> Advent of Code 2022 is a yearly event that brings together computer programmers and enthusiasts from all over the
> world.
> Every day from December 1st to December 25th, a new puzzle is released on the official website. The puzzles vary in
> difficulty and are designed to test your coding skills.

### Join the challenge with me

If you want to join the challenge with me, you can find the puzzles on the official
website: [https://adventofcode.com/](https://adventofcode.com/).

You can also join my private leaderboard `1663489-c3aa9b4d` by going https://adventofcode.com/2022/leaderboard/private.

## Project structure

The project is structured as follows:

- `solutions`: contains the source code of the solutions for each day.
- `blog`: contains the blog posts for each day.
- `scripts`: contains the script used to generate all required files for each day.

### Solutions

The solutions are written in Kotlin and are located in the `solutions` directory. The source code is split into two
packages:

- [`fr.triozer.aoc/y2022.days`](solutions/src/main/kotlin/fr/triozer/aoc/y2022/days): contains the source code for each day.
- [`fr.triozer.aoc.utils`](solutions/src/main/kotlin/fr/triozer/aoc/y2022/utils): contains the source code for the
  utilities used by the solutions.

You can also find the resources used in the [`src/main/resources`](solutions/src/main/resources) directory. Each day has
its own directory and are composed of the following files:

- `input.in`: my (can different from yours) input file provided for the day.
- `test.in`: the input given in the puzzle description.

### Blog

The blog is developed using [Vitepress](https://vitepress.vuejs.org/) and the posts are located in
the [`blog/docs`](blog/docs)directory.

The objective is to write a blog post for each day, explaining the solution and the challenges encountered during the
development.

_PS: I'll try to write a blog post for each day, but I can't guarantee it... :smile:_

## How to generate the files for a new day?

To generate the files for a new day, you can use the [`new-day`](scripts/new-day) script. It will create all the needed
files.

Example:

```shell
chmod +x scripts/new-day

./scripts/new-day 3
```
