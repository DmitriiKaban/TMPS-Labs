package com.app.entities;

public class Phone extends Product {
    public Phone() {
        name = "Phone";
        price = 699.99;
    }

    @Override
    public void create() {
        System.out.println("Phone created.");
    }
}
