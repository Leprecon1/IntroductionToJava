package com.company;

public class Student {
   private String surname;
   private int numberOfGroup;
    private  int[] progress;

    public Student(String surname, int numberOfGroup,int[] progress){
        this.surname = surname;
        this.numberOfGroup = numberOfGroup;
        this.progress = progress;
    }

    public String getSurname(){
        return surname;
    }

    public int getNumberOfGroup(){
        return numberOfGroup;
    }

    public int[] getProgress(){
        return  progress;
    }
}
