package com.company;

public class Task06_MaxReal {
    public static void main(String[] args) {
        double[] a = new double[] {1.2d, 3.2d, -4.5, 10.5, -15.3};
        double max = a[0];
        for (int i = 0; i < a.length-1; i++){
            if (max > (a[i] + a[i+1]))
            {
                max = a[i] + a[i+1];
            }
        }
        System.out.printf("max =%f" ,max);
    }
}
