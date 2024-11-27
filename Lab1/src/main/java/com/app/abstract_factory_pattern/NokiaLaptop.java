package com.app.abstract_factory_pattern;

import com.app.entities.Laptop;

public class NokiaLaptop extends Laptop {

    public NokiaLaptop() {
        name = "Nokia Laptop";
        price = 899.99;
    }

    @Override
    public void create() {
        System.out.println("Nokia Laptop created.");
    }
}
