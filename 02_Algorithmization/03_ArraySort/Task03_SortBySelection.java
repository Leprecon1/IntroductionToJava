package com.company;

public class Task03_SortBySelection {
    public static void main(String[] args) {
        int[] a = new int[] {1,3,5,-5,4,-10,3,8};
        selectionSort(a);
        outputArray(a);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
    public static void outputArray(int[] arr){
        System.out.println("mas = ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
