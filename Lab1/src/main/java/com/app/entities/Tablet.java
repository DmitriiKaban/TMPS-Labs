package com.app.entities;

public class Tablet extends Product {
    public Tablet() {
        name = "Tablet";
        price = 499.99;
    }

    @Override
    public void create() {
        System.out.println("Tablet created.");
    }
}
