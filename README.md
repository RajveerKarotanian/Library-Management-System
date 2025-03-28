---

# Library Management System

## Overview
This project is a **Library Management System** implemented in Java. It allows users to manage books, audiobooks, and library accounts. The system supports borrowing and returning books, tracking overdue items, calculating fees, and sorting books by author and title. The program demonstrates object-oriented programming (OOP) principles, including inheritance, encapsulation, and polymorphism.

---

## Features
- **Book Management:**
  - Add, remove, and display books.
  - Borrow and return books.
  - Check if a book is overdue.
  - Sort books by author and title.

- **Audiobook Management:**
  - Inherits from the `Book` class.
  - Adds a narrator attribute.
  - Supports all book management features.

- **Account Management:**
  - Create and manage library accounts.
  - Borrow and return books.
  - Calculate fees for overdue books.

- **Library Management:**
  - Manage a collection of books and accounts.
  - Display all books and accounts.
  - Sort books using the `Comparable` interface.

---

## Classes

### 1. `Book`
- Represents a book with attributes like `name`, `author`, `borrower`, and `daysBorrowed`.
- Methods:
  - `borrow(String borrower)`: Marks the book as borrowed.
  - `returnBook()`: Marks the book as returned.
  - `isOverdue()`: Checks if the book is overdue.
  - `toString()`: Provides a string representation of the book.
  - `equals(Object book)`: Compares two books for equality.
  - `compareTo(Book book)`: Compares books for sorting.

### 2. `AudioBook` (extends `Book`)
- Represents an audiobook with an additional `narrator` attribute.
- Methods:
  - `toString()`: Provides a string representation of the audiobook.
  - `equals(Object book)`: Compares two audiobooks for equality.

### 3. `Account`
- Represents a library account with attributes like `name`, `fees`, and `borrowedBooks`.
- Methods:
  - `borrowBook(Book book)`: Borrows a book if available.
  - `returnBook(Book book)`: Returns a borrowed book.
  - `updateFees()`: Calculates fees for overdue books.
  - `toString()`: Displays account details, borrowed books, and fees.

### 4. `Library`
- Manages a collection of books and accounts.
- Methods:
  - `addBook(Book book)`: Adds a book to the library.
  - `removeBook(Book book)`: Removes a book from the library.
  - `addAccount(Account account)`: Adds an account to the library.
  - `removeAccount(Account account)`: Removes an account from the library.
  - `sortBooks()`: Sorts books by author and title.
  - `displayBooks()`: Displays all books in the library.
  - `displayAccounts()`: Displays all accounts in the library.

---

## Example Usage
- Run Test.java to see how all classes are used together

---

## Requirements
- Java Development Kit (JDK) 8 or later.

---

## Author
- **Rajveer Karotanian**
- Date: 3/11/25

---
