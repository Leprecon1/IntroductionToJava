package com.company;

import java.util.Random;

public class Task12_RowSort {
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
        System.out.println("sort Ascending");
        int tmp;
        for (int i = 0; i < n ; i++)
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (a[i][j] > a[i][k]) {
                    tmp = a[i][j];
                    a[i][j] = a[i][k];
                    a[i][k] = tmp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sort descending");
        for (int i = 0; i < n ; i++)
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i][j] < a[i][k]) {
                        tmp = a[i][j];
                        a[i][j] = a[i][k];
                        a[i][k] = tmp;
                    }
                }
            }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
