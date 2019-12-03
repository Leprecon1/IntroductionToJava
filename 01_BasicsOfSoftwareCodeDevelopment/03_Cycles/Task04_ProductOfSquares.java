package com.company;

import java.math.BigInteger;

public class Task04_ProductOfSquares {
    public static void main(String[] args) {
        BigInteger pr = BigInteger.valueOf(1);
        for (int i = 1; i < 200; i++) {
            pr = pr.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println("pr=" + pr);
    }
}
