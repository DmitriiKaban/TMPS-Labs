# Creational Design Patterns Report

## 1. Overview
In this project, we implemented **three creational design patterns** using an Object-Oriented language (Java). The patterns include:
1. Singleton
2. Factory Method
3. Abstract Factory

Each of these patterns addresses the problem of object creation and helps in making the system more flexible, decoupled, and easier to maintain. Below is the explanation and implementation of each pattern.

---

## 2. Singleton Pattern

### **What is the Singleton Pattern?**
The **Singleton Pattern** ensures that a class has only one instance and provides a global point of access to that instance. It is often used for managing shared resources, configuration settings, or logging.

### **Implementation**
In the project, we have a class called `ShoppingCart` that handles data related to a shopping cart. We want to ensure that only one instance of the `ShoppingCart` class is created. To achieve this, we use the Singleton Pattern.

```java
public class ShoppingCart {

    private static ShoppingCart instance;
    private List<Product> products;

    private ShoppingCart() {
        products = new ArrayList<>();
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            return new ShoppingCart();
        }
        return instance;
    }
    ...
```

## 3. Factory Method Pattern

### **What is the Factory Method Pattern?**
The **Factory Method Pattern** defines an interface for creating objects, but lets subclasses decide which class to instantiate. It allows a class to defer instantiation to subclasses.

### **Implementation**

In the project, we have a `ProductFactory` class that creates different types of products based on the input provided. The `ProductFactory` class has a factory method `createProduct` that returns a specific type of product based on the input.

```java
public class ProductFactory {

    public Product createProduct(String type) {
        if (type.equals("Electronics")) {
            return new ElectronicsProduct();
        } else if (type.equals("Clothing")) {
            return new ClothingProduct();
        } else {
            return null;
        }
    }
}
```

## 4. Abstract Factory Pattern

### **What is the Abstract Factory Pattern?**
The **Abstract Factory Pattern** provides an interface for creating families of related or dependent objects without specifying their concrete classes. It is useful when a system needs to work with multiple types of related objects.

### **Implementation**

We designed an ElectronicsFactory to produce related products (phones, laptops and tablets) for different brands (HTC and Nokia). Each concrete factory (HtcFactory, NokiaFactory) creates products specific to its brand.

```java
interface ElectronicsFactory {
    Phone createPhone();
    Laptop createLaptop();
}
class HtcFactory implements ElectronicsFactory {
    @Override
    public Phone createPhone() {
        return new HtcPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new HtcLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new HtcTablet();
    }
}
```

## 6. Conclusion
In this project, we demonstrated the usage of three creational design patterns—Singleton, Factory Method, and Abstract Factory. Each pattern solves the problem of object creation in its own way, offering flexibility, reusability, and maintainability. By understanding and implementing these patterns, you can create systems that are better structured and easier to extend.