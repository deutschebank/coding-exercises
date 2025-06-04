package com.exchange.rates.endpoints.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("I am ok...");
    }
}