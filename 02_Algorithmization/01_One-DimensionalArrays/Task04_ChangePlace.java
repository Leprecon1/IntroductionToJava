package com.company;

import java.util.Arrays;

public class Task04_ChangePlace {
    public static void main(String[] args) {
        int[] array = new int[] {1,3,2,-9,11,4};
        int max = array[0];
        int min = array[0];
        int imin = 0;
        int imax = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
                imax = i;
            }
            if (array[i] < min){
                min = array[i];
                imin = i;
            }
        }
        array[imin] = max;
        array[imax] = min;
        System.out.println("source array:");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
