package com.company;

import java.util.Random;
import java.util.Scanner;
public class Task08_FractionalCommonDenominator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dimension =");
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] den = new int[n];
        Input(num, n);
        Input(den,n);
        Output(num,den);
        System.out.println("Find the common denominator");
        CommonDenominator(num,den);
        Output(num,den);
        System.out.println("Fractional by increasing");
        Sort(num,den);
        Output(num,den);
    }
    public static void Input(int[] a, int n) {
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(9)+1;
        }
    }

    public static int Nod(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static int Nok(int x, int y) {
        return (x / Nod(x, y) * y);
    }

    public static void CommonDenominator(int[] num, int[] den) {
                int k = Nok(den[0],den[1]);
                for (int i = 0; i < num.length; i++)
                    k = Nok(k,den[i]);
                for (int i = 0; i < num.length; i++){
                    int m = k / den[i];
                    num[i] = num[i] * m;
                    den[i] = den[i] * m;
                }
    }


    public static void Sort(int[] a, int[] b) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i]  > a[i + 1]) {
                    isSorted = false;

                    buf = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buf;

                    buf = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = buf;
                }
            }
        }
    }


    public static void Output(int[] a, int[] b){
        for (int i = 0; i < a.length; i++){
            System.out.printf("%d/%d ",a[i],b[i]);
        }
        System.out.println();
    }
}




