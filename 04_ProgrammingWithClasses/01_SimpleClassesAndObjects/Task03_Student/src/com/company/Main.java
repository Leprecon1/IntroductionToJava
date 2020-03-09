package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student st = new Student("Khon",17,new int[] {9,10,9,10});
        Student st1 = new Student("Nik",18,new int[] {6,8,7,8});
        Student st2 = new Student("Jhon",19,new int[] {4,4,4,4});
        Student st3 = new Student("Insen",3,new int[] {9,9,9,10});
        Student st4 = new Student("Ref",1,new int[] {6,8,7,8});

        Student[] students = new Student[]{st,st1,st2,st3,st4};
        for (int i = 0; i < students.length; i++){
                if (Arrays.stream(students[i].getProgress()).sum() >= 36) {
                    System.out.println("Surname " + students[i].getSurname());
                    System.out.println("Groups " + students[i].getNumberOfGroup());
                }
       }
    }
}
