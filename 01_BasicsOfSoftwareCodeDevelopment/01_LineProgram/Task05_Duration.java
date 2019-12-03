package com.company;

public class Task05_Duration {
    public static void main(String[] args) {
        int T = 86390;
        int hours = (int) (T / (Math.pow(60, 2)));
        int minutes = (int) ((T / (Math.pow(60, 1) ) % 60));
        int seconds = T % 60;
        System.out.printf("hours=%d minutes=%d seconds=%d", hours, minutes, seconds);
    }
}
