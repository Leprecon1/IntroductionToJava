package com.company;

public class Main {

    public static void main(String[] args) {
	   Wheel wh = new Wheel(10);
	   Engine eg = new Engine(300);
	   Car cr = new Car("sedan",wh,eg);
        System.out.println("car model : ");
        System.out.println(cr.getName());
    }
}
