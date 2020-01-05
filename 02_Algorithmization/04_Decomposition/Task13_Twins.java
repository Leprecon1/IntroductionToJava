package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Task13_Twins {
    public static void main(String[] args) {
        int n = 100;
        int k = 0;
        for (int i = n; i < 2*n-2; i++){
            if (PrimeNumber(i) && PrimeNumber(i+2)){
                k++;
                System.out.println(i+ " "+(i+2));
            }

        }
        if (k == 0)
            System.out.println("Таких пар нет");
    }
    public static boolean PrimeNumber(int a) {
        if (a == 1)
            return false;
        int i = 2;
        while (i * i <= a){
            if (a % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
