package com.app;

import com.app.entities.*;

class ProductFactory {
    public static Product createProduct(String type) {
        return switch (type.toLowerCase()) {
            case "phone" -> new Phone();
            case "laptop" -> new Laptop();
            case "tablet" -> new Tablet();
            default -> throw new IllegalArgumentException("Unknown product type");
        };
    }
}