package com.company;

public class Task01_Triangles {

    public static void main(String[] args) {
        double angel1 = 90.0;
        double angel2 = 45.0;
        if (angel1 + angel2 >= 180){
            System.out.println("such a triangle does not exist");
            System.exit(0);
        }
        double angel3 = 180 - angel1 + angel2;
        if ((angel1 == 90d) || (angel2 == 90d)
                    ||  (angel3 == 90d)){
            System.out.println("rectangular");
        }
        else{
            System.out.println("not rectangular");
        }

    }
}
