package com.company;

import java.util.Scanner;

public class Task01_ConcatArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("array size A =");
        int n = sc.nextInt();
        int[] a = new int[100];
        System.out.println("Source mass");
        for (int i = 0; i < n; i++){
           a[i] = i;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("array size B =");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Source mass");
        for (int i = 0; i < b.length; i++){
            b[i] = n + i;
            System.out.print(b[i]+" ");
        }
        System.out.println();
       System.out.println("k=");
       int k = sc.nextInt();
       for (int i = 0; i < m; i++){
            n++;
            for (int j = n-1; j >= k+i; j--){
                a[j] = a[j-1];
            }
           a[k+i] = b[i];
       }
        System.out.println("mass a = ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
