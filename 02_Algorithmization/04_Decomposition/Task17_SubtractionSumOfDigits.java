package com.company;

public class Task17_SubtractionSumOfDigits {
    public static void main(String[] args) {
        int n = 256;
        int count = countSubtract(n);
        System.out.println("Quantity iterations = " + count);
    }

    public static int sumDigits(int n){
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            n/=10;
            sum+=digit;
        }
        return sum;
    }

    public static int subtractSumOfDigits(int n){
        n-=sumDigits(n);
        return n;
    }

    public static int countSubtract(int n){
        int count = 0;
        while (n > 0){
           n = subtractSumOfDigits(n);
            count++;
        }
        return count;
    }
}

