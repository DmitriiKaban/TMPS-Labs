package com.app.abstract_factory_pattern;

import com.app.entities.*;

public interface ElectronicsFactory {
    Phone createPhone();
    Laptop createLaptop();
    Tablet createTablet();
}
