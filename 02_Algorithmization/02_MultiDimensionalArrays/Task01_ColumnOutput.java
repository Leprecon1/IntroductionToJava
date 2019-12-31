package com.company;

public class Task01_ColumnOutput {

    public static void main(String[] args) {
        int[][] a = {
                {-9,1,0,3,8},
                {4,1,1,6,7},
                {-2,2,-1,2,6},
                {5,1,-1,-9,-21},
        };
        int n = a.length -1;
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if ((j % 2 ==0) && (a[0][j] > a[n][j])) {
                    System.out.print(a[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
