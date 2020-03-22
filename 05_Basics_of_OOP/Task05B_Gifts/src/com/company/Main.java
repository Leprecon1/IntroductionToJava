package com.company;

public class Main {

    public static void main(String[] args) {
	    Sweets sw1 = new Sweets("chocolate","Nestle");
        Sweets sw2 = new Sweets("sweet","Rashen");
        Sweets sw3 = new Sweets("lollipop","Chupa Chups");
        Packaging packaging = new Packaging("shavings","yellow");
        Sweets[] sweets = new Sweets[]{sw1,sw2,sw3};
        Gift gift = new Gift(sweets,packaging);
        gift.create();
    }
}
