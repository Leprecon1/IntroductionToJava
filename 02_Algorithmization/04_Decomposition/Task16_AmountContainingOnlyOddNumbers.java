package com.company;

public class Task16_AmountContainingOnlyOddNumbers {
    public static void main(String[] args) {
        int n = 3;
        int sum = AmountContainingOnlyOddNumbers(n);
        System.out.println("sum = " + sum);
        System.out.println("quantity of even numbers = " + countEvenDigits(sum));
    }

    public static int rangeDefinition(int n) {
        return (int) Math.pow(10,n-1);
    }

    public static boolean onlyOddDigits(int n){
        while (n > 0){
            if (evenNumber(n)){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean evenNumber(int n){
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static int AmountContainingOnlyOddNumbers(int n) {
        int sum = 0;
        for (int i = rangeDefinition(n); i < rangeDefinition(n+1); i++){
            if (onlyOddDigits(i)){
                sum+=i;
            }
        }
        return sum;
    }

    public static int countEvenDigits(int n){
        int count = 0;
        while (n > 0){
            if (evenNumber(n))
                count++;
            n/=10;
        }
        return count;
    }

}
