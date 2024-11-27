package com.app;

abstract class Logger {

    protected Severity logLevel;
    protected Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(Severity level, String message) {
        if (this.logLevel.getSeverity() <= level.getSeverity()) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
