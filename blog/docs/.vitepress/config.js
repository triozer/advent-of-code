import { defineConfig } from "vitepress"

export default defineConfig({
  title: "AOC",
  description: "triozer's Advent of Code blog",
  lastUpdated: true,
  cleanUrls: "without-subfolders",
  themeConfig: {
    socialLinks: [
      {
        icon: "github",
        link: "https://github.com/triozer/aoc-2022",
      },
      {
        icon: "twitter",
        link: "https://twitter.com/triozeroff",
      },
    ],
    nav: [{
      text: "Home",
      link: "/",
    }],
    sidebar: [{
      text: "2022",
      // collapsible: true,
      // collapsed: true,
      items: [
        {
          text: "Day 01: Calorie Counting",
          link: "/day-01",
        },
        {
          text: "Day 02: Rock Paper Scissors",
          link: "/day-02",
        },
        {
          text: "Day 03: Rucksack Reorganization",
          link: "/day-03",
        },
        {
          text: "Day 04: Camp Cleanup",
          link: "/day-04",
        },
      ],
    }],
  },
})
