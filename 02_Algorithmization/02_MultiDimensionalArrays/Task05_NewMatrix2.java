package com.company;

public class Task05_NewMatrix2 {
    public static void main(String[] args) {
        int n = 6;
        int k =1;
        int [][]a = new int[n][n];
        for (int i = 0; i<n; i++){
            for (int j=0; j<n; j++){
                a[i][j] = k;
            }
            k++;
        }
        int c = n;
        for (int i = 0; i<n; i++ ){
        for (int j  = 0; j<n; j++ ){
            for (int t =0; t<n; t++){
                if (j == c+t) {
                    a[i][j] = 0;
                }
            }
        }
        c--;
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.print(a[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
