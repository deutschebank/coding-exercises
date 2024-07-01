module.exports = (pool) => ({
  findAll: async () => {
    const { rows } = await pool.query('SELECT * FROM CURRENCY')
    return rows
  },

  findById: async ({ currencyId }) => {
    const { rows: [ firstEntry ] } = await pool.query({
      name: 'fetch-currency-by-id',
      text: 'SELECT * FROM CURRENCY WHERE ID = $1',
      values: [ currencyId ]
    })
    return firstEntry
  },

  findBySymbol: async ({ currencySymbol }) => {
    const { rows: [ firstEntry ] } = await pool.query({
      name: 'fetch-currency-by-symbol',
      text: 'SELECT * FROM CURRENCY WHERE SYMBOL = $1',
      values: [ currencySymbol ]
    })
    return firstEntry
  }
})
  