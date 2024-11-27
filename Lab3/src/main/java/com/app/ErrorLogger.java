package com.app;

class ErrorLogger extends Logger {
    public ErrorLogger() {
        this.logLevel = ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR: " + message);
    }
}


