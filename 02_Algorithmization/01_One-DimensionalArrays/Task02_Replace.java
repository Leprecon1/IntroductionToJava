package com.company;

public class Task02_Replace {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 6, -3, 9, 8};
        int z = 4;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (z > a[i]) {
                a[i] = z;
                count++;
            }
            ;
        }
        System.out.println("array output");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nnumber of replace = " + count);
    }
}
