package com.company;

import java.util.Random;

public class Task07_SumOfTheOddNumerFactorials {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println("Sum of the odd Number Factorials = " + SumOfTheOddNumberFactorials(arr));
    }

    public static int fact(int n) {
        int p = 1;
        for (int i = 1; i < n+1; i++){
           p*=i;
        }
        return p;
    }

    public static boolean oddNumber(int n){
        if (n % 2 != 0)
            return true;
        else
            return false;
    }
    public static int SumOfTheOddNumberFactorials(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (oddNumber(arr[i])){
                sum+=fact(arr[i]);
            }
        }
        return sum;
    }

}
