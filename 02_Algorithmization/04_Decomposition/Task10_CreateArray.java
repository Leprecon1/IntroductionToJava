package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task10_CreateArray {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        System.out.println(a);
        int n = ArrayDimensions(a);
        int[] arr = new int[n];
        inputInArray(arr, a);
        sort(arr);
        output(arr);
    }
    public static int ArrayDimensions(int a){
        int count = 0;
        while (a > 0){
            a = a / 10;
            count++;
        }
        return count;
    }

    public static void inputInArray(int[] arr, int a) {
        int i = 0;
        while (a > 0){
            arr[i] = a % 10;
            a = a / 10;
            i++;
        }
    }

    public static void sort(int[] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            int tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }

    public static void output(int[] arr){
        System.out.print("array = ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
