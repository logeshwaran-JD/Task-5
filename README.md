# ATM System

A simple Java program that works like an ATM machine.

## What it does

- Deposit money into account
- Withdraw money from account
- Check account balance
- Multiple transactions in one session

## Requirements

- Java 8 or higher

## How to run

1. Save the code as `Customer.java`
2. Compile: `javac Customer.java`
3. Run: `java Customer`

## How to use

1. Enter your account number
2. Choose from menu options:
   - **1** = Deposit money
   - **2** = Withdraw money
   - **3** = Check balance
   - **4** = Exit
3. Confirm with your account number
4. Follow the instructions

## Example

```
=== Welcome to ATM ===
Enter your Account Number: 12345

Choose an option:
1. Deposit
2. Withdraw
3. Balance Inquiry
4. Exit
Enter your choice (1-4): 1

Enter your account number to confirm: 12345
Enter the amount to deposit: 500
Amount deposited successfully
New Balance: 500.0
```

## Features

- Account starts with $0 balance
- Can do multiple transactions
- Shows current balance after each transaction
- Input validation for amounts
- Account verification for security

## Notes

- Enter only positive amounts
- Make sure you have enough balance to withdraw
- Account number must match for transactions
- Choose option 4 to exit safely

Simple and secure ATM operations!
