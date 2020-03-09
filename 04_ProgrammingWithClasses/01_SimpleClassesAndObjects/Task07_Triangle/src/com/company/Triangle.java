package com.company;

public class Triangle {
   private Point A;
   private Point B;
   private Point C;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
    }


    public double computingSquare(){
        return  1/2d * ( (A.getX() - C.getX() *
                (B.getY() - C.getY()) - (B.getX() - C.getX()) * A.getY() - C.getY()));
    }

    public double computingPerimeter(){
        double AB = Math.sqrt(Math.pow(B.getX() - A.getX(),2) + Math.pow(B.getY() - A.getY(),2));
        double BC = Math.sqrt(Math.pow(C.getX() - B.getX(),2) + Math.pow(C.getY() - B.getY(),2));
        double AC = Math.sqrt(Math.pow(A.getX() - C.getX(),2) + Math.pow(A.getY() - C.getY(),2));
        return  AB+BC+AC;
    }

    public Point FindPointOfMedian(){
        double x = (A.getX() + B.getX() + C.getX()) / 3d;
        double y = (A.getY() + B.getY() + C.getY()) / 3d;
        return new Point(x,y);
    }
}
