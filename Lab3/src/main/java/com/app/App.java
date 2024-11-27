package com.app;

public class App {
    private static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger();
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);

        return debugLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        System.out.println("Example log messages:");
        loggerChain.logMessage(Severity.DEBUG, "This is a debug message.");
        loggerChain.logMessage(Severity.INFO, "This is an info message.");
        loggerChain.logMessage(Severity.ERROR, "This is an error message.");
    }
}
