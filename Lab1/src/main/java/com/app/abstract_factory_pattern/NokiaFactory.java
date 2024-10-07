package com.app.abstract_factory_pattern;

import com.app.entities.Laptop;
import com.app.entities.Phone;
import com.app.entities.Tablet;

public class NokiaFactory implements ElectronicsFactory {

    @Override
    public Phone createPhone() {
        return new NokiaPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new NokiaLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new NokiaTablet();
    }
}
