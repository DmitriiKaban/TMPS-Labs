package com.app.abstract_factory_pattern;

import com.app.entities.Tablet;

public class HtcTablet extends Tablet {
    public HtcTablet() {
        name = "Htc Tablet";
        price = 599.99;
    }

    @Override
    public void create() {
        System.out.println("Htc Tablet created.");
    }
}
