package com.company;

public class Task07_IncreasingSequence {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,5,8,12};
        int[] b = new int[] {7,3,9,11};
        outputArray(a);
        outputArray(b);

        System.out.println("so that sequence remains increasing:");
        for(int i = 0; i < b.length; i++){
            for (int j = 0; j < a.length; j++){
                if (b[i] >= a[j] && b[i] <= a[j+1]){
                    System.out.printf("element %d must be put in %d position",b[i],j+2);
                }
            }

            System.out.println();
        }
    }
    public static void outputArray(int[] arr) {
        System.out.println("mas = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}