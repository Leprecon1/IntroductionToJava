package com.company;

import java.util.Random;

public class Task13_ColSort {
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
        boolean b;
        for (int j = 0; j < n; j++){
            do{
            b = true;
            for (int i = 0; i < n-1; i++){
                if (a[i][j] > a[i+1][j]){
                    b = false;
                    tmp = a[i+1][j];
                    a[i+1][j] = a[i][j];
                    a[i][j] = tmp;
                }
            }
            }while(b == false);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("sort descending");
        for (int j = 0; j < n; j++){
            do{
                b = true;
                for (int i = 0; i < n-1; i++){
                    if (a[i][j] < a[i+1][j]){
                        b = false;
                        tmp = a[i+1][j];
                        a[i+1][j] = a[i][j];
                        a[i][j] = tmp;
                    }
                }
            }while(b == false);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}




