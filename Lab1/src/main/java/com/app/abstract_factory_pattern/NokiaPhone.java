package com.app.abstract_factory_pattern;

import com.app.entities.Phone;

public class NokiaPhone extends Phone {
    public NokiaPhone() {
        name = "Nokia Phone";
        price = 499.99;
    }

    public void display() {
        System.out.println("Nokia Phone");
    }

    @Override
    public void create() {
        System.out.println("Nokia Phone created.");
    }
}
