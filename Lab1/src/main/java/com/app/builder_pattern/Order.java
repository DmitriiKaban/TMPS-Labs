package com.app.builder_pattern;

import com.app.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private double discount;
    private String shippingAddress;

    private Order(OrderBuilder builder) {
        this.products = builder.products;
        this.discount = builder.discount;
        this.shippingAddress = builder.shippingAddress;
    }

    public static class OrderBuilder {
        private List<Product> products = new ArrayList<>();
        private double discount;
        private String shippingAddress;

        public OrderBuilder addProduct(Product product) {
            products.add(product);
            return this;
        }

        public OrderBuilder withDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public OrderBuilder toShippingAddress(String address) {
            this.shippingAddress = address;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order with " + products.size() + " products, discount: " + discount + ", shipping to: " + shippingAddress;
    }
}

