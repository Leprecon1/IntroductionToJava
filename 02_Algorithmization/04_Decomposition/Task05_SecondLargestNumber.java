package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task05_SecondLargestNumber {
    public static void main(String[] args) {
        System.out.println("enter arr dimension");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        input(a);
        System.out.println("Our arr");
        Output(a);
        SecondLargestNumber(a);
    }

    public static void input(int[] a){
        Random rd = new Random();
        for (int i = 0; i < a.length; i++){
            a[i] = rd.nextInt(100);
        }
    }

    public static void SecondLargestNumber(int[] a){
        int i, first, second;
        if (a.length < 2)
        {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < a.length ; i++)
        {
            if (a[i] > first)
            {
                second = first;
                first = a[i];
            }
            else if (a[i] > second && a[i] != first)
                second = a[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"+
                    " element\n");
        else
            System.out.print("The second largest element"+
                    " is "+ second);

    }

    public static void Output(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
