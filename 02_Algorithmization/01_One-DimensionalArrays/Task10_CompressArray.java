package com.company;

import java.util.Arrays;

public class Task10_CompressArray {
    public static void main(String[] args) {
        int[] a = new int[] {1,3,4,2,3,32,4};
        int n = a.length;

        for (int i = 0; i < n; i++){
            if (i % 2 ==0)
            {
                a[i] = 0;
            }

        }
        for (int i = 0; i < n ; i++)
        {
            System.out.print(a[i] + " ");

        }
    }
}

