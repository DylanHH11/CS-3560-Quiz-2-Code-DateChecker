# DateChecker - TDD & JUnit 5 Implementation

## Overview
`DateChecker` is a Java utility developed using Test-Driven Development (TDD) and JUnit 5 to determine whether a given calendar month contains 31 days.

---

## Architectural & Design Specifications

### 1. `Month` Enum
A public enumeration defining the twelve standard calendar months:
- `JANUARY`, `FEBRUARY`, `MARCH`, `APRIL`, `MAY`, `JUNE`, `JULY`, `AUGUST`, `SEPTEMBER`, `OCTOBER`, `NOVEMBER`, `DECEMBER`.

### 2. Method: `has31Days(Month month)`
- **31-Day Months**: Returns `true` for `JANUARY`, `MARCH`, `MAY`, `JULY`, `AUGUST`, `OCTOBER`, and `DECEMBER`.
- **Non-31-Day Months**: Returns `false` for `APRIL`, `JUNE`, `SEPTEMBER`, and `NOVEMBER`.
- **February Handling**: February contains either 28 or 29 days depending on leap years; therefore, it never has 31 days. The method explicitly handles February by returning `false`.
- **Input Validation**: Rejects `null` inputs by throwing an `IllegalArgumentException` with the message `"Month cannot be null"`.

---

## Test Execution Instructions

### Prerequisites
- Java 17+ (or Java 21)
- Apache Maven 3.8+

### Running the Test Suite
To execute all JUnit 5 test cases from the command line:

```bash
mvn clean test
```