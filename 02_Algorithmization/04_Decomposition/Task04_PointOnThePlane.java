package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task04_PointOnThePlane {
    public static void main(String[] args) {
        System.out.println("enter the number of points");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        input(x,y);
        Output(x,y);
        MaxDistance(x,y);
    }
    public static void input(double[] a, double[] b){
        for (int i = 0; i < a.length; i++){
            a[i] = Math.random()  ;
            b[i] = Math.random() ;
        }
    }
    public static void Output(double[] a, double[] b){
        for (int i = 0; i < a.length; i++){
            System.out.printf("%d point = x1=%f y1=%f ",i+1,a[i],b[i]);
            System.out.println();
        }
    }
    public static void MaxDistance(double[] a, double[] b ){
        double maxDist = 0;
        int k = 0;
        for (int i = 0; i < a.length-1; i++){
            double d =  Math.sqrt(Math.pow(a[i+1] - a[i],2) + Math.pow(b[i+1] - b[i],2));
            if (maxDist<d){
                maxDist = d;
                k = i;
            }
        }
        System.out.println();
        System.out.printf("Max distance between %d and %d point", k+1,k+2);
    }
}

