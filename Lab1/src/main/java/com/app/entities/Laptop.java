package com.app.entities;

public class Laptop extends Product {
    public Laptop() {
        name = "Laptop";
        price = 1199.99;
    }

    @Override
    public void create() {
        System.out.println("Laptop created.");
    }
}
