package com.company;

import java.util.Random;

public class Task14_MatrixZeroAndOne {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(6)+3;
        int m = rd.nextInt(6)+3;
        int[][] a = new int[m][n];

        System.out.println("Source matrix");
        for (int i = 0; i < m  ; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i)
                    a[i][j] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
        }
    }
}
