package com.app.abstract_factory_pattern;

import com.app.entities.Laptop;

public class HtcLaptop extends Laptop {
    public HtcLaptop() {
        name = "Htc Laptop";
        price = 999.99;
    }

    public void create() {
        System.out.println("Htc Laptop");
    }
}
