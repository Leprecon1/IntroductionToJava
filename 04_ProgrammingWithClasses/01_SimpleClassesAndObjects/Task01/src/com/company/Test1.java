package com.company;

public class Test1 {
    private int a = 10;
    private  int b = 20;

    public int maxValue() {
        return Math.max(a,b);
    }


    public int sumVariable(){
        return  a + b;
    }

    public void changeVariable(){
        a++;
        b++;
    }

    public void printVariable(){
        System.out.println(a);
        System.out.println(b);
    }
}
