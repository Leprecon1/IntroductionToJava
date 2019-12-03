package com.company;
import java.util.Scanner;
public class Task01_SimpleFunction {

    public static void main(String[] args) {
        double z, a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("input a");
        a = in.nextDouble();
        System.out.println("input b");
        b = in.nextDouble();
        System.out.println("input c");
        c = in.nextDouble();
        in.close();
        z = ((a - 3) * b / 2) + c;
        System.out.println("z=" + z);
    }

}

