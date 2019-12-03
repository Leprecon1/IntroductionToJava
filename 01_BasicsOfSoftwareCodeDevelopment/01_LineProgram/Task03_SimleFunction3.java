package com.company;
import java.util.Scanner;
public class Task03_SimleFunction3 {
    public static void main(String[] args) {
        double f,x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("input x");
        x = in.nextDouble();
        System.out.println("input y");
        y = in.nextDouble();
        in.close();
        f = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y));
        System.out.println("value of expression="+f);
    }
}
