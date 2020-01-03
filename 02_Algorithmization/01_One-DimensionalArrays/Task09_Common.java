package com.company;

public class Task09_Common {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,1,-3,5,6,5};
        System.out.println(getMostaNumber(a));

    }

    public static int getMostaNumber(int[] array) {
        int[] a = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    a[i]++;
                }
            }
        }
        int valResult = array[0];
        int popResult = array[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > popResult) {
                popResult = a[i];
                valResult = array[i];
            }
            if ((popResult == a[i]) && (array[i] < valResult)) {
                valResult = array[i];
            }
        }
        return valResult;

    }
}