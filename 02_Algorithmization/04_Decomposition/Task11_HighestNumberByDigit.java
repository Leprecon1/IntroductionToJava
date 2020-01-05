package com.company;

import javax.sql.rowset.serial.SQLOutputImpl;
import javax.xml.transform.Source;
import java.util.Scanner;

public class Task11_HighestNumberByDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number = ");
        int FirstNumber = sc.nextInt();
        System.out.println("second number = ");
        int SecondNumber = sc.nextInt();
        HighestNumberByDigit(FirstNumber,SecondNumber);
    }
    public static int AmountOfNumber(int a){
        int count = 0;
        while (a > 0){
            a = a / 10;
            count++;
        }
        return count;
    }

    public static void HighestNumberByDigit(int a, int b){
        if (AmountOfNumber(a) > AmountOfNumber(b))
            System.out.println("First number is greater");
        else if (AmountOfNumber(a) < AmountOfNumber(b))
            System.out.println("Second number is greater");
        else System.out.println("numbers are equal");
    }
}
