import { defineConfig } from "vitepress"

export default defineConfig({
  title: "AOC",
  description: "triozer's Advent of Code blog",
  lastUpdated: true,
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
      items: [
        {
          text: "Day 01",
          link: "/day-01",
        },
        {
          text: "Day 02",
          link: "/day-02",
        },
        {
          text: "Day 03",
          link: "/day-03",
        },
        {
          text: "Day 04",
          link: "/day-04",
        },
      ],
    }],
  },
})
