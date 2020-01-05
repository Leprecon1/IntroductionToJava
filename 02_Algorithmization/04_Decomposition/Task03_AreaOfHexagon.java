package com.company;

import java.util.Scanner;

public class Task03_AreaOfHexagon {
    public static void main(String[] args) {
        System.out.println("enter the side of the hexagon =");
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        System.out.println("Area of hexagon = " + area_of_hexagon(a));
    }

    public static double area_of_hexagon(int a) {
        double AreaOfTreangle = (Math.sqrt(3)/4) * Math.pow(a,2);
        return  Math.round(6 * AreaOfTreangle * 1000) / 1000;
    }
}
