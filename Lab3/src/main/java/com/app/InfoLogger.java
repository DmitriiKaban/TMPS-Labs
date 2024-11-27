package com.app;

class InfoLogger extends Logger {
    public InfoLogger() {
        this.logLevel = INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO: " + message);
    }
}


