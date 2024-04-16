const express = require('express')
const fs = require('fs')
const app = express()

// 本地记得加.
app.get('/status', async (_, res) => {
  const data = await fs.readFileSync('/variable.json', 'utf8')
  const json = JSON.parse(data)
  return res.json({ status: json.status })
})

app.get('/change', async (req, res) => {
  const status = req.query?.status === 'true'
  const json = JSON.stringify({ status })
  await fs.writeFileSync('/variable.json', json ,'utf8')
  return res.json({ status: 'success' })
})

app.listen(3001, () => console.log('Server ready on port 3001.'))

module.exports = app