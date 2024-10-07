package com.app;

import com.app.entities.Laptop;
import com.app.entities.Phone;
import com.app.entities.Product;

public class App {
    public static void main(String[] args) {

        // Singleton Pattern: Shopping Cart, always address the same instance
        ShoppingCart cart = ShoppingCart.getInstance();
        cart.addProduct(ProductFactory.createProduct("phone"));
        cart.addProduct(ProductFactory.createProduct("laptop"));

        // Factory Method Pattern: Product Creation
        Product tablet = ProductFactory.createProduct("tablet");
        tablet.create();

        // Builder Pattern: Creating an Order
        Order order = new Order.OrderBuilder()
                .addProduct(new Phone())
                .addProduct(new Laptop())
                .withDiscount(10.0)
                .toShippingAddress("bvd. St. Cel Mare 15")
                .build();

        System.out.println(order);
    }
}

