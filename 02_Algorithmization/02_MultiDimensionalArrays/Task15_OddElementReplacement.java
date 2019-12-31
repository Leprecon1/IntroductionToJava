package com.company;

import java.util.Random;

public class Task15_OddElementReplacement {
    public static void main(String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        Random rd = new Random();
        System.out.println("Source matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] > max)
                    max = a[i][j];
            }
        }
        System.out.println(max);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] % 2 == 1)
                    a[i][j] = max;
            }
        }

        System.out.println("Transformed matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}



