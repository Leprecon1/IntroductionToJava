package com.company;

import java.util.Random;

public class Task09_MaxColAmount {
    public static void main(String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int max = 0;
        for (int j = 0; j < n; j++) {
            sum = 0;
            {
                for (int i = 0; i < n; i++) {
                    sum += a[i][j];
                }
                if (max < sum){
                    max = sum;
                }
                System.out.println("Sum=" + sum);
            }
        }
        System.out.println("MaxAmountCol="+max);
    }
}
