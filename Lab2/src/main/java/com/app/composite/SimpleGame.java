package com.app.composite;

public class SimpleGame implements Game {
    private String name;

    public SimpleGame(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Playing " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
