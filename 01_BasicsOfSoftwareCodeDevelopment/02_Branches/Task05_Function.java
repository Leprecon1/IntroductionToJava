package com.company;

public class Task05_Function {
    public static void main(String[] args) {
        double x = 2;
        double f=0;
        if (x<=3){
           f = Math.pow(x,2) - 3*x + 9;
        }
        if (x>3){
            f = 1 / (Math.pow(x,2) + 6);
        }
        System.out.println("F(x)="+f);
    }
}
