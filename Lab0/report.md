# Fruits management system

## Introduction
In this project, I have implemented a simple fruits management system that allows users to wash fruits.
The system consists of the following classes: `Fruit`, `FruitService`, `AppleService`, `BananaService`, and `WashingMachine`.
The main goal of this project is to demonstrate the application of SOLID principles in a real-world scenario.

## SOLID Principles Implemented

### 1. Liskov Substitution Principle (LSP)
All subclasses of `Fruit` can be used interchangeably in `FruitService`. This is because they all inherit from the same base class and implement the same interface.

### 2. Dependency Inversion Principle (DIP)
The `WashingMachine` class does not depend directly on the concrete implementations of FruitServiceImplementations.
Instead, it relies on the `FruitService`, promoting a higher level of abstraction and decoupling.

## Conclusion

This project demonstrates the application of SOLID principles in a simple fruits management system. By following these principles, we can create more maintainable, flexible, and scalable software systems.