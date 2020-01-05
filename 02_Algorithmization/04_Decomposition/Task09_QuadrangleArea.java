package com.company;

public class Task09_QuadrangleArea {
    public static void main(String[] args) {
        double x = 4;
        double y = 5;
        double z = 7;
        double t = 6;
        System.out.println("Quadrangle area = " + QuadrangleArea(x,y,z,t));
    }

    public static double PythagoreanTheorem(double a, double b){
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public static double AreaOfFirstTriangle(double a, double b){
        return (a*b) / 2;
    }

    public static double AreaOfSecondTriangle(double a, double b, double c){
        double p = (a+b+c) / 2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    public static double QuadrangleArea(double x, double y, double z, double t){
        double d = PythagoreanTheorem(x,y);
        double SumAreaTriangle = AreaOfFirstTriangle(x,y) + AreaOfSecondTriangle(t,z,d);
        return Math.round(SumAreaTriangle*1000)/1000;
    }
}
