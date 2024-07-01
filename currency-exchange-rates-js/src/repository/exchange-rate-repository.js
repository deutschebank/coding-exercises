module.exports = (pool) => ({
  findExchangeRate: async ({ fromCurrencySymbol, toCurrencySymbol }) => {
    const { rows: [ firstEntry ] } = await pool.query({
      name: 'fetch-exchange-rate',
      text: `SELECT * FROM EXCHANGE_RATE WHERE 
        FROM_CURRENCY_ID = (SELECT ID FROM CURRENCY WHERE SYMBOL = $1)
        AND TO_CURRENCY_ID = (SELECT ID FROM CURRENCY WHERE SYMBOL = $2)`,
      values: [ fromCurrencySymbol, toCurrencySymbol ]
    })

    return firstEntry
  }
})
