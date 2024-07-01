const express = require('express')

const port =  process.env.PORT || 3000
const app = express()

app.get('/health', (_, res) => res.send({ status: 'I am ok...' }))

app.listen(port, () => console.log(`currency-exchange-rates app listening on port ${port}`))
