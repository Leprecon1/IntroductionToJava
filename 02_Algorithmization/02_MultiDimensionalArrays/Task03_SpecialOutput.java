package com.company;

import java.util.Scanner;

public class Task03_SpecialOutput {
    public static void main(String[] args) {
        int[][] a = {
                {-9,1,0,3,8},
                {4,1,1,6,7},
                {-2,2,-1,2,6},
                {5,1,-1,-9,-21},
                {3,8,-1,8,-2},
        };
        System.out.println("enter row number");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("enter column number");
        int r = sc.nextInt();
        for (int i=0; i < a[k].length; i++){
            System.out.print(a[k-1][i] + "\t");
        }
        System.out.println();
        for (int j =0; j < a[r].length; j++){
            System.out.print(a[j][r-1] + "\t");
        }
    }
}
