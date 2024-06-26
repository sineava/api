const express = require('express')
const app = express()

let status = false

app.use((_, res, next) => {
  res.header('Access-Control-Allow-Origin', '*')
  next()
})

// 本地记得加.
app.get('/status', async (_, res) => {
  return res.json({ status })
})

app.get('/change', async (req, res) => {
  status = req.query?.status === 'true'
  return res.json({ status })
})

app.listen(3000, () => console.log('Server ready on port 3000'))