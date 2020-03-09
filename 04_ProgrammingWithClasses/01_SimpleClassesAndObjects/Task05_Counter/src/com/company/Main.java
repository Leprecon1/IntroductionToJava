package com.company;

public class Main {

    public static void main(String[] args) {
	  Counter ct = new Counter();
	  ct.increase();
	  Counter ct1 = new Counter(34);
        ct1.reduce();
    }
}
