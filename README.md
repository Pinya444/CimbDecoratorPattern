# CIMB Decorator Pattern – Java Implementation

## 📌 Problem Statement

CIMB is a digital bank that offers GSave and UpSave savings accounts. As with a typical  
Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%.  
The benefits of the typical savings account are the same with the "Standard Savings Account"  
as compared to other banks.

The GSave account offers an interest rate of 2.5%.  
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.  
Benefits include the "Standard Savings Account" plus "With Insurance".

### Description of the Methods

- **showAccountType()** – returns `"Savings Account"`, `"GSave"`, or `"UpSave"`
- **getInterestRate()** – returns `1%` for Savings Account, `2.5%` for GSave, `4.0%` for UpSave
- **getBalance()** – returns the balance of the account
- **showBenefits()** –  
  - `"Standard Savings Account"` for SavingsAccount  
  - SavingsAccount benefits + `"GSave Transfer"`  
  - SavingsAccount benefits + `"With Insurance"`
- **computeBalanceWithInterest()** – returns the new balance after applying the interest rate
- **showInfo()** – prints account number, account name, and balance

`BankAccountDecorator` must be an **interface**.

Only the methods shown in the UML (plus getters and setters) are allowed.

---

## 📘 UML Class Diagram

![UML Diagram](https://github.com/Pinya444/CimbDecoratorPattern/blob/main/Screenshot%202025-12-10%20223148.jpg)

## Uploaded java codes for the solution.
