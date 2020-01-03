package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task02_NonDecreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("array size A =");
        int n = sc.nextInt();
        int[] a = new int[100];
        System.out.println("Source as");
        for (int i = 0; i < n; i++){
            a[i] = rd.nextInt(20)-10;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("array size B =");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Source as");
        for (int i = 0; i < b.length; i++){
            b[i] = rd.nextInt(20)-10;;
            System.out.print(b[i]+" ");
        }
        System.out.println();

        for (int i = 0; i <m; i++){
            n++;
            a[n-1] = b[i];
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < n-1; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;

                    buf = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buf;
                }
            }
        }

        System.out.println("as a = ");
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
