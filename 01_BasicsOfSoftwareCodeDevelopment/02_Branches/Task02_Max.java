package com.company;

public class Task02_Max {
    public static void main(String[] args) {
        int a=1, b=3, c=4, d=2;
        int number1 = Math.min(a,b);
        int number2 = Math.min(c,d);
        int result = Math.max(number1,number2);
        System.out.println("max{min(a, b), min(c, d)}="+result );
    }
}
