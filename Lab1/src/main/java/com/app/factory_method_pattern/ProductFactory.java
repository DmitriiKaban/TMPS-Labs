package com.app.factory_method_pattern;

import com.app.entities.*;

public class ProductFactory {
    public static Product createProduct(String type) {
        return switch (type.toLowerCase()) {
            case "phone" -> new Phone();
            case "laptop" -> new Laptop();
            case "tablet" -> new Tablet();
            default -> throw new IllegalArgumentException("Unknown product type");
        };
    }
}