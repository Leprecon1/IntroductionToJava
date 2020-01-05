package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task08_DetermineAmount {
    public static void main(String[] args) {
        System.out.println("input array dimensions");
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int[] arr = new int[n];
        input(arr);
        Output(arr);
        System.out.println("k=");
        int k = sn.nextInt();
        System.out.println("m=");
        int m = sn.nextInt();
        if (m-k != 3){
            System.out.println("Error");
            System.exit(0);
        }

        System.out.println(Sum(arr,k,m));
    }

    public static void input(int[] arr) {
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
    }
    public static void Output(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int Sum(int[] arr,int k, int m){
        int sum = 0;
        for (int i = k; i < m ; i++){
            sum+=arr[i];
        }
        return sum;
    }
}