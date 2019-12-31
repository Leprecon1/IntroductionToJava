package com.company;

public class Task02_Diagonal {
    public static void main(String[] args) {
        int[][] a = {
                {-9,1,0,3,8},
                {4,1,1,6,7},
                {-2,2,-1,2,6},
                {5,1,-1,-9,-21},
                {3,8,-1,8,-2},
        };
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                if (i == j){
                    System.out.print(a[i][j] + "\t");
                }
            }
        }
    }
}
