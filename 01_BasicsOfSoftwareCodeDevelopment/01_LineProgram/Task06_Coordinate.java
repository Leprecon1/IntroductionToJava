package com.company;
import javax.swing.*;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
public class Task06_Coordinate {
    public static void main(String[] args) {
        double x,y;
        boolean b=false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        System.out.println("input x");
        x = in.nextDouble();
        System.out.println("input y");
        y = in.nextDouble();
        in.close();
        if ((x>=-4 && x<=4) || (y>=-3 && x<=4)){
            b = true;
            System.out.println(b);
        }
        else {
            System.out.println(b);
        }
    }
}
