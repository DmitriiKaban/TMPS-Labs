# Creational Design Patterns Report

## 1. Overview
In this project, I implemented **three structural design patterns** using Java. The patterns include:
1. Facade
2. Composite
3. Adapter

Each pattern is implemented in a separate package within the project. The implementation details and examples are provided below.

---

## 2. Facade Pattern

### **What is the Facade Pattern?**
The **Facade Pattern** provides a unified interface to a set of interfaces in a subsystem. It defines a higher-level interface that makes the subsystem easier to use.

### **Implementation**
In the project, I have a class called `FootballGameFacade` that acts as a facade for the subsystems involved in a football game. The `FootballGameFacade` provides a simple interface to start, play, and end a football game, hiding the complexity of the subsystems from the client. So here the 'FootballGameFacade' incapsulates `Stadium`, `Scoreboard`, and `LightingSystem` objects.

```java
public class FootballGameFacade {
    private Stadium stadium;
    private Scoreboard scoreboard;
    private LightingSystem lightingSystem;

    ...
```

## 3. Composite Pattern

### **What is the Composite Pattern?**
The **Composite Pattern** allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

### **Implementation**

In the project, I have a `Game` interface that defines the common operations for both leaf and composite components (name of the game and the possibility to play). The `SimpleGame` class represents the individual components (leafs), while the `CompositeGame` class represents the composite components that can contain other components. 
```java
public interface Game {
    void play();
    String getName();
    void setName(String name);
}
```

Here is the structure of the class that represents individual components.

```java
public class SimpleGame implements Game {
    private String name;
    ...
```

This is a structure for the composite components as it has inside a list with `Game` instances.

```java
public class CompositeGame implements Game {
    private String name;
    private List<Game> games;
    ...
```



## 4. Adapter Pattern

### **What is the Adapter Pattern?**

The **Adapter Pattern** allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces, converting the interface of a class into another interface that a client expects.

### **Implementation**

In the project, I have a `Person` interface that defines the common operations for persons from different countries. The `ChinesePerson` and `GermanPerson` classes represent the concrete implementations of the `Person` interface. `TranslatorAdapter` allows different `Person` implementations to communicate through a common interface. But `TranslatorFromUnknownLanguages` helps us to communicate with people who speak unknown languages (is adapter between unknown languages and ours).

```java
public class TranslatorFromUnknownLanguages implements Person {

    private SolarPerson solarPerson;
    ...
}
public class TranslatorAdapter {
    private Person person;

    public void communicate() {
        person.speak();
    }
}

public interface Person {
    void speak();
}
```

## 6. Conclusion
In this project, I have implemented three structural design patterns: **Facade**, **Composite**, and **Adapter**. These patterns help us to make a more simple design, make code reusable and flexible.
