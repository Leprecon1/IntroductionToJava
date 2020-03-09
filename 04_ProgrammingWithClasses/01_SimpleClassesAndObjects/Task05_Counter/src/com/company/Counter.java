package com.company;

public class Counter {
    private int state;

    public int getState() {
        return state;
    }

    public Counter() {
        this.state = 0;
    }

    public Counter(int state) {
        this.state = state;
    }

    public void increase(){
        state++;
    }
    public void reduce() {
        state--;
    }
}

