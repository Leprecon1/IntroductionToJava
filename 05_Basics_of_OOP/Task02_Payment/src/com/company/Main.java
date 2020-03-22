package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product pr = new Product(1,"apple");
        Product pr1 = new Product(2,"banana");
        Product pr2 = new Product(3,"milk");
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(pr);
        products.add(pr1);
        products.add(pr2);
        Payment payment = new Payment(products);
        payment.buy("milk");
        payment.buy("apple");
        payment.productList();
    }
}
