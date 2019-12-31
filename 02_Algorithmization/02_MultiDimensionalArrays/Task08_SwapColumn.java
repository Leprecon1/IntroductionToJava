package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task08_SwapColumn {
    public static void main(String[] args) {
        int n = 6;
        int[][] a = new int[n][n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rd.nextInt(10);
            }
        }
        System.out.println("original matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("first column number");
        int c = sc.nextInt();
        System.out.println("second column number");
        int c1 = sc.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = a[i][c - 1];
            a[i][c - 1] = a[i][c1 - 1];
            a[i][c1 - 1] = temp;
        }
        System.out.println("new matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
