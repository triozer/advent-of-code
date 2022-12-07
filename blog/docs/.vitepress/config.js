import { defineConfig } from "vitepress"
import { generateSidebars } from "./sidebars"

export default defineConfig({
  title: "AOC",
  description: "triozer's Advent of Code blog",
  lastUpdated: true,
  cleanUrls: "without-subfolders",
  themeConfig: {
    socialLinks: [
      {
        icon: "github",
        link: "https://github.com/triozer/advent-of-code",
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
    sidebar: generateSidebars(),
  },
})
