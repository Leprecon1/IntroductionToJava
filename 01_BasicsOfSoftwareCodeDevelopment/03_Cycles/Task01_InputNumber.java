package com.company;

import java.util.Scanner;

public class Task01_InputNumber {

    public static void main(String[] args) {
        int sum=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter a positive number");
        int n = inp.nextInt();
        for (int i=1; i<n; i++){
            sum +=i;
        }
        System.out.println("sum="+sum);

    }
}
