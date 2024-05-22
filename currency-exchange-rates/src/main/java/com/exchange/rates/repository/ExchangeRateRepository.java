package com.exchange.rates.repository;

import com.exchange.rates.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
    @Query(value = "SELECT * from exchange_rate ex " +
            "where ex.from_currency_id = (select id from currency where symbol=:fromCurrencySymbol) " +
            "and ex.to_currency_id = (select id from currency where symbol=:toCurrencySymbol)",
            nativeQuery = true)
    Optional<ExchangeRate> getExchangeRate(String fromCurrencySymbol, String toCurrencySymbol);
}