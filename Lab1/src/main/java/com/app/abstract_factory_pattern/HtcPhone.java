package com.app.abstract_factory_pattern;

import com.app.entities.Phone;

public class HtcPhone extends Phone {
    public HtcPhone() {
        name = "Htc Phone";
        price = 799.99;
    }

    @Override
    public void display() {
        System.out.println("Htc Phone");
    }

    public void create() {
        System.out.println("Htc Phone created.");
    }
}


