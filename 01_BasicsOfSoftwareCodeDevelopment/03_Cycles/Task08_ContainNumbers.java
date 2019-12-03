package com.company;

import java.util.Scanner;

public class Task08_ContainNumbers {
    public static void main(String[] args) {
        int number1 = 1347;
        int number2 = 1634;
        while (number1 > 0) {
            int d = number1 % 10;
            number1 /= 10;
            int c = number2;
            while (c > 0) {
                if ((c % 10) == d) {
                    System.out.print(d + " ");
                    break;
                }
                c /= 10;
            }
      
        }
    }
}


