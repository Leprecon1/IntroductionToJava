package com.company;

public class Task02_Segment {
    public static void main(String[] args) {
       double a=-10,b=10,y=0,h=0.3;
       double x = a;
       while(x<=b){
           if (x<=2){
             y = x;
           }
           if (x>2) {
               y = -x;
           }
           x+=h;
       }
        System.out.println(y);
    }
}
