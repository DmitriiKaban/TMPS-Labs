package com.app.abstract_factory_pattern;

import com.app.entities.Laptop;
import com.app.entities.Phone;
import com.app.entities.Tablet;

public class HtcFactory implements ElectronicsFactory {

    @Override
    public Phone createPhone() {
        return new HtcPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new HtcLaptop();
    }

    @Override
    public Tablet createTablet() {
        return new HtcTablet();
    }
}
