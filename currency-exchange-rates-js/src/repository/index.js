const { Pool } = require('pg')

const pool = new Pool()

module.exports = {
  currencyRepository: require('./currency-repository')(pool),
  exchangeRateRepository: require('./exchange-rate-repository')(pool)
}
