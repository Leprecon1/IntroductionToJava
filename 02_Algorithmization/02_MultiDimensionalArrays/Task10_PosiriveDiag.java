package com.company;

import java.util.Random;

public class Task10_PosiriveDiag {
    public static void main(String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rd.nextInt(10)-5;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Positive elements of the main diagonal");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) && (a[i][j] >= 0)){
                    System.out.print(a[i][j] + " ");
                }
            }
        }

    }
}
