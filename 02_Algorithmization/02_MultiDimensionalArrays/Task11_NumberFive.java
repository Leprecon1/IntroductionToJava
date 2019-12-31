package com.company;

import java.util.Random;

public class Task11_NumberFive {
    public static void main(String[] args) {
        int[][] a = new int[10][20];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = rd.nextInt(   16);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("line numbers");
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 5){
                    k++;
                }
            }
            if (k==3)
                System.out.print(i+1 + " ");

            k = 0;

        }
    }
}
