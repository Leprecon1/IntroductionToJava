package com.company;

public class Task01_FractionMetods {
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
}


