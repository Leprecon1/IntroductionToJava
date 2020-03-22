package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Payment {
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<String> takeList = new ArrayList<String>();

    public Payment(ArrayList<Product> products) {
        this.products.addAll(products);
    }

    public void buy(String name){
        for (Product product : products) {
            if (product.getName() == name){
                takeList.add(name);
                return;
            }
        }
        System.out.println("this product does not exist");
    }

    public void productList(){
        System.out.println(takeList);
    }

}
