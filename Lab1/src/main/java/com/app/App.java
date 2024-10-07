package com.app;

import com.app.abstract_factory_pattern.ElectronicsFactory;
import com.app.abstract_factory_pattern.NokiaFactory;
import com.app.builder_pattern.Order;
import com.app.entities.Laptop;
import com.app.entities.Phone;
import com.app.entities.Product;
import com.app.entities.Tablet;
import com.app.factory_method_pattern.ProductFactory;
import com.app.singletone.ShoppingCart;

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


        // Abstract Factory: Nokia products
        // explanation of pattern
        ElectronicsFactory nokiaFactory = new NokiaFactory();
        Phone nokiaPhone = nokiaFactory.createPhone();
        Laptop nokiaLaptop = nokiaFactory.createLaptop();
        Tablet nokiaTablet = nokiaFactory.createTablet();

        nokiaPhone.create();
        nokiaLaptop.create();
        nokiaTablet.create();
    }
}

