package com.company;

import java.util.Scanner;

public class Task07_Dividers {
    public static void main(String[] args) {
        System.out.println("beginning of gap =");
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        System.out.println("end of gap =");
        int n = inp.nextInt();
        for (int i=m; i<n; i++){
            System.out.print(i+":");
            for (int j=2; j<i/2+1; j++ ){
                if ((i % j)==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
