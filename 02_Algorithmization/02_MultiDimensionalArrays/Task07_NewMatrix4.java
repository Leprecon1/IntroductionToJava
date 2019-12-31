package com.company;

public class Task07_NewMatrix4 {
    public static void main(String[] args) {
        int n = 6;
        int CountNeg = 0;
        double[][] a = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin((i*i - j*j) / n);
                if (a[i][j] >= 0){
                    CountNeg++;
                }
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("%.2f",a[i][j])+ " ");
            }
            System.out.println();
        }
        System.out.println("The number of positive is " + CountNeg);
    }
}