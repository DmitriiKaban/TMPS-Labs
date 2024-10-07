# Fruits management system

## Introduction
This project implements a simple fruit management system in Java, adhering to several principles
of object-oriented design known as SOLID principles. The system is designed to handle different
types of fruits and to perform different actions.

## SOLID Principles Implemented

### 1. Liskov Substitution Principle (LSP)
All subclasses of `Fruit` can be used interchangeably in `FruitService`. This ensures
the system operates correctly regardless of the specific notification sender implementation.

### 2. Dependency Inversion Principle (DIP)
The `WashingMachine` class does not depend directly on the concrete implementations of FruitServiceImplementations.
Instead, it relies on the `FruitService`, promoting a higher level of abstraction and decoupling.

## Conclusion

This project successfully demonstrates the application of key SOLID principles in a real-world scenario.
By following these principles, the code remains modular, extensible, and maintainable.
Overall, this exercise illustrates the importance of good design practices in software development.