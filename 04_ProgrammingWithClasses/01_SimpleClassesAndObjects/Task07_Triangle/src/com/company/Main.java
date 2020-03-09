package com.company;

public class Main {

    public static void main(String[] args) {
	  Triangle tr = new Triangle(new Point(3,2), new Point(7,3), new Point(5,5));
        System.out.println(tr.computingPerimeter());
        System.out.println(tr.computingSquare());
        System.out.println(tr.FindPointOfMedian());
    }
}
