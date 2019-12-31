package com.company;

import java.util.Scanner;

public class Task04_NewMatrix {
    public static void main(String[] args) {
        System.out.println("n=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][n+1];
        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < n+1; j++){
                if ( i % 2 != 0 )
                {
                    a[i][j] = j;
                }
                else{
                    a[i][j] = n+1-j;
                }
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();

        }

    }
}
