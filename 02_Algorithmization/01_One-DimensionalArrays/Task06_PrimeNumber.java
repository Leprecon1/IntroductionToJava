package com.company;

public class Task06_PrimeNumber {
    public static void main(String[] args) {
        int[] a = new int[] {1,5,-2,6,-3,1}; //порядковые номера которых     являются простыми числами.
        int sum = 0;
        for (int i = 1; i < a.length; i++) {
            if ((i+1) % 2 != 0){
                sum+=a[i];
            }
        }
        System.out.println("sum = "+sum);
    }

}
