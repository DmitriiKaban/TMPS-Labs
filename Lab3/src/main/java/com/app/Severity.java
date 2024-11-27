package com.app;

public enum Severity {
    INFO(1), DEBUG(2), ERROR(3);

    private int severity;

    Severity(int severity) {
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }
}
