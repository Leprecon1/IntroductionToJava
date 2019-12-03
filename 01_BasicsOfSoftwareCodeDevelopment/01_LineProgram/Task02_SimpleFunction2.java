package com.company;
import java.util.Scanner;
public class Task02_SimpleFunction2{
    public static void main(String[] args) {
        double f,a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("input a");
        a = in.nextDouble();
        System.out.println("input b");
        b = in.nextDouble();
        System.out.println("input c");
        c = in.nextDouble();
        in.close();
        f = ( (b + Math.sqrt(Math.pow(b,2) + 4*a*c)) / (2*a) - Math.pow(a,3)*c + Math.pow(b,-2) );
        System.out.println("value of expression="+f);
    }
}
