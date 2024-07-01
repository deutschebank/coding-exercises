# 🚀 Currency Exchange Rates

Exchange Rates web service provides currency exchange support for 65 currencies.

Following currencies are supported: EUR, AED, AMD, ANG, AOA, AUD, CAD, CDF, CHF, CZK, GBP, GEL, KHR, KID, KMF, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LYD,MAD, MDL, MGA, MKD, MMK, MNT, MOP, MRU, MUR, MVR, MWK, MXN, MYR, MZN,NAD, NGN, NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG,QAR, RON, RSD, RUB, RWF, SAR, SBD, SCR, SDG, SEK, SGD, USD.

The tasks will be presented to you by our interviewer.

## Prerequisites

- NodeJS 18
- Docker

## Run the app

Run ```docker compose up``` to start the postgress database, it is already populated with all currencies and random exchange rates for all possible currency combinations.

Run ```npm start``` to start the application on port ```3000```, it will automatically reload on every file modification.

Run ```curl 127.0.0.1:3000/health``` to check a preconfigured health endpoint.
