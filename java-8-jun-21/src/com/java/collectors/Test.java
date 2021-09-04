package com.java.collectors;

import java.util.function.Consumer;

class Product {
    int id;

    Product(int id) {
        this.id = id;
    }

    public String toString() {
        return "Product " + id;
    }
}

public class Test {

    public static void main(String[] args) {
        Product product = new Product(1);

        Consumer<Product> consumerE = (Product p) -> System.out.println(product.id);
        consumerE.accept(new Product(2));

    }
}