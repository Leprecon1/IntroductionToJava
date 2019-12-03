package com.company;

public class Task05_RowAmount {
    public static void main(String[] args) {
        double n=2,an=0,sum=0;
        double e=0.1;
        for (int i=2; i<100; i++){
            an = 1 / Math.pow(i, n);
            sum+=an;
            if  (an>= Math.abs(e)) {
                break;
            }
        }
        System.out.println("Row Amount = "+sum);
    }
}
