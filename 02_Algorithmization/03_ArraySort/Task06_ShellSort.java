package com.company;

public class Task06_ShellSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, -5, 4, -10, 3, 8};
        Shellsort(a);
        outputArray(a);
    }
    public static void outputArray(int[] arr) {
        System.out.println("mas = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int Shellsort(int arr[])
    {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
        return 0;
    }
}
