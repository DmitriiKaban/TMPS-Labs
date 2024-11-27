# Behavioral Design Patterns Report

## 1. Overview
In this project, I implemented **Chain of responsibility design patterns** using Java. The implementation details and examples are provided below.

---

### **What is the Chain of responsibility Pattern?**
The **Chain of Responsibility Pattern** is a behavioral design pattern that allows you to pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

### **Implementation**
In the project, I have a `Logger` abstract class that defines the common operations for all handlers. 

```java
abstract class Logger {

    protected Severity logLevel;
    protected Logger nextLogger;
    ...
```

Also, this class has common method `logMessage()` for all of its subclasses. That method checks the log level and writes the message if the log level is less than or equal to the current log level. If the next logger exists, it calls the `logMessage()` method of the next logger.

```java
public void logMessage(Severity level, String message) {
        if (this.logLevel.getSeverity() <= level.getSeverity()) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }
```

Method `write()` is abstract and should be implemented in subclasses. 

```java
    protected abstract void write(String message);
```

The `DebugLogger`, `InfoLogger`, `ErrorLogger` classes represent the inheritance from the `Logger` abstract class. For instance, here is DebugLogger class:

```java
class DebugLogger extends Logger {
    public DebugLogger() {
        this.logLevel = Severity.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
```

 The `App` class in the method getChainOfLoggers() creates a chain of handlers and returns the instance of `Logger` abstract class. It creates the chain of handlers in the following order: `DebugLogger`, `InfoLogger`, `ErrorLogger`.

```java
private static Logger getChainOfLoggers() {
    Logger errorLogger = new ErrorLogger();
    Logger infoLogger = new InfoLogger();
    Logger debugLogger = new DebugLogger();

    debugLogger.setNextLogger(infoLogger);
    infoLogger.setNextLogger(errorLogger);

    return debugLogger;
}
```

## 6. Conclusion
In this project, I implemented the Chain of Responsibility design pattern using Java. This pattern allows you to pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.