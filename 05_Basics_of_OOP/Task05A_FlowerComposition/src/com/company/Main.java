package com.company;

public class Main {

    public static void main(String[] args) {
        Flower fl1 = new Flower("Rose","iceberg");
        Flower fl2 = new Flower("Clove","garden");
        Flower fl3 = new Flower("Narcissus","trumpet");
        Packaging packaging = new Packaging("paper","felt","red");
        Flower[] flowers = new Flower[]{fl1,fl2,fl3};
        FlowerComposition fc = new FlowerComposition(flowers,packaging);
        fc.create();
    }
}

