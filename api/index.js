const express = require('express')
const app = express()

let status = false

app.get('/status', (_, res) => {
  return res.json({ status })
})

app.get('/change', (req, res) => {
  status = req.query.status || false
  return res.send('success')
})

app.listen(3000, () => console.log('Server ready on port 3000.'))

module.exports = app