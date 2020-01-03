package com.company;

public class Task05_InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, -5, 4, -10, 3, 8};
        insertionSort(a);
        outputArray(a);
    }

    public static void outputArray(int[] arr) {
        System.out.println("mas = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

}
