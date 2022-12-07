import * as fs from "fs"

export function generateSidebars () {
  const files = fs.readdirSync("docs").sort((a, b) => b.localeCompare(a))
  const exclude = [".vitepress", "index.md"]

  const sidebars = []

  files.forEach((file) => {
    if (exclude.includes(file)) {
      return
    }

    const folderName = file

    const items = [{
        text: "Introduction",
        link: `/${folderName}/`,
    }]

    const days = fs.readdirSync(`docs/${folderName}`)
    days.forEach(file => {
      const fileName = file.replace(".md", "")
      if (fileName === "index") {
        return
      }

      const content = fs.readFileSync(`docs/${folderName}/${file}`, "utf8")
      const title = content.match(/# \[(.*)\]/)[1]

      items.push({
        text: title,
        link: `/${folderName}/${fileName}`,
      })
    })

    const startDate = new Date(`${folderName}-12-01`)
    const endDate = new Date(`${Number(folderName) + 1}-12-01`)
    const today = new Date()

    sidebars.push({
      collapsible: true,
      collapsed: !(today >= startDate && today < endDate),
      text: folderName,
      items,
    })
  })

  return sidebars
}
