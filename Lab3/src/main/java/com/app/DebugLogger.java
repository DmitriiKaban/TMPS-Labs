package com.app;

class DebugLogger extends Logger {
    public DebugLogger() {
        this.logLevel = DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}



