package com.company;
public class Task06_NewMatrix3 {
    public static void main(String[] args) { // [n - j -1] or [n -j +1]
        int n = 6;
        int[][] a = new int[n][n];
        for (int i = 0; i < n / 2  ; i++) {
            for (int j = 0; j < i  ; j++) {
                a[i][j] = 0;
                a[i][n - j - 1] = 0;
            }
            for (int j = i; j < n / 2  ; j++) {
                a[i][j] = 1;
                a[i][n - j - 1] = 1;
            }
        }
        for (int i = n / 2 ; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                a[i][j] = 0;
                a[i][n - j - 1] = 0;
            }
            for (int j = n - i - 1; j < n / 2; j++) {
                a[i][j] = 1;
                a[i][n - j - 1] = 1;
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
