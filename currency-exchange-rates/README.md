# 🚀 Currency Exchange Rates

Exchange Rates web service provides currency exchange support for 65 currencies.

Following currencies are supported: EUR, AED, AMD, ANG, AOA, AUD, CAD, CDF, CHF, CZK, GBP, GEL, KHR, KID, KMF, KRW, KWD,
KYD, KZT, LAK, LBP, LKR, LRD, LSL, LYD,MAD, MDL, MGA, MKD, MMK, MNT, MOP, MRU, MUR, MVR, MWK, MXN, MYR, MZN,NAD, NGN,
NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG,QAR, RON, RSD, RUB, RWF, SAR, SBD, SCR, SDG, SEK, SGD, USD.

The tasks will be presented to you by our interviewer.

## Prerequisites

- JDK 21

## Run the app

```./gradlew bootRun``` will start the app on port ```3000```.

For hot-reloading during development run ```./gradlew -t :bootJar``` on a separate command line.

Run ```curl http://localhost:3000/exchange-rates/api/v1/health``` to check a preconfigured health endpoint.

## H2 in-memory database

* application is configured to use H2 in-memory database
* database is already populated with all currencies and random exchange rates for all possible currency combinations
* [H2 web console](http://localhost:3000/exchange-rates/api/v1/h2-console/) is enabled