# Credit Card Number Validation

Write a function to validate credit card numbers according to the Luhn algorithm, described below. This will be used for web-based validations and therefore should be tolerant of edge conditions and invalid data that users might input. In addition, it is
required to support the entry of credit card numbers both with spaces and without spaces and to validate each of these appropriately.

You should prove its operation through test cases.

## The Luhn Algorithm

The Luhn algorithm, also known as the "modulus 10" or "mod 10" algorithm, is a simple check digit formula used to validate a variety of identification numbers. It is named after its creator, IBM scientist Hans Peter Luhn. The algorithm is in the public
domain and is in wide use today. It is not a cryptographically secure hash function. It was designed to protect against accidental errors, rather than malicious attacks. Most credit cards and many government identification numbers use the algorithm as a
simple method of distinguishing valid numbers from mistyped or otherwise incorrect numbers.

To validate a card number using the Luhn algorithm:

1. Starting from the right, double the value of the second-to-last digit and continue doing the same for every second digit. If the result of any doubling operation is greater than 9, then add the digits of the result to obtain a single-digit number.
   Example: 6 × 2 = 12; 1 + 2 = 3

2. Sum all the digits you didn’t double and the new values you got from doubling.

3. The number is considered valid according to the Luhn algorithm if the total is divisible by 10.


# Examples

Valid test card number: 4556 7375 8689 9855

Invalid test card number: 4024 0071 0902 2143

Some more valid test card numbers:

| Card number         | Description                  |
|:--------------------|:-----------------------------|
| 4988438843884305    | Visa                         |
| 5200828282828210    | Mastercard debit             |
| 378282246310005     | American Express (15 digits) |
| 6011000990139424    | Discover                     |
| 36227206271667      | Diners Club (14 digits)      |
| 4000001234562345678 | Visa (19 digits)             |

