package com.company;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Task05_OutPart {
    public static void main(String[] args) {
        int[] a = new int[] {1,5,2,6,-3,1};
        for (int i = 0 ; i < a.length; i++){
            if (a[i] > i){
                System.out.print(a[i] + " ");
            }
        }
    }
}
