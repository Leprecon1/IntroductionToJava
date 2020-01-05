package com.company;

public class Task15_StrictlyIncreasingSequence {
    public static void main(String[] args) {
        int n = 4;
        increasingSequence(n);
    }
    public static void increasingSequence(int n){
        for (int j = 1; j < 8; j++){
            if (j + n <= 10 ){
                for (int i = 1; i < n+1; i++){
                    System.out.print(j + i - 1);
                }
            }
            System.out.print(" ");
        }
    }
}
