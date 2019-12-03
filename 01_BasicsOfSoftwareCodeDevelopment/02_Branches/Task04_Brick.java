package com.company;

public class Task04_Brick {
    public static void main(String[] args) {
        int A=10, B=20;
        int x=2,y=5,z=3;
        if (((A>=x) && (B>=y)) || ((A>=y) && (B>=x))
        || ((A>=x) && (B>=z)) || ((A>=z) && (B>=x))
        || (((A>=z) && (B>=y)) || ((A>=y) && (B>=z)))){
            System.out.println("Breaks in");
        }
        else{
            System.out.println("does not fit");
        }
    }
}
