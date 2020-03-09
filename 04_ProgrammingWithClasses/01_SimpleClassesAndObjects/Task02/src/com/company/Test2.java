package com.company;

public class Test2 {
    private  int first;
    private  int second;

    public int getFirst(){
        return first;
    }

    public void setFirst(int first){
        this.first = first;
    }

    public int getSecond(){
        return second;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public  Test2(){
        first = 1;
        second = 2;
    }

    public Test2(int f, int s){
        first = f;
        second = s;
    }
}
