package com.company;

import javax.xml.transform.Source;

public class Task12_SpecialArray {
    public static void main(String[] args) {
        int k = 8; int n = 60;
        System.out.printf("k=%d n=%d",k,n);
        System.out.println();
        ArrayFormation(k,n);
    }
    public static void ArrayFormation(int k, int n){
        for (int i = 10; i < n; i++){
            int a = i % 10;
            int b = (i / 10) % 10;
            int sum = a + b;
            if ((sum == k) && (sum < n)){
                System.out.println(i)   ;
            }
        }
    }
}
