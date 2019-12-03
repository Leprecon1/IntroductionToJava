package com.company;

public class Task04_Replace {
    public static void main(String[] args) {
        double R = 123.456; //nnn.ddd
        int nnn = (int)R;
        int ddd = (int)((R - nnn)*1000);
        double result = ddd + (double)nnn/1000;
        System.out.println(result);
    }
}
