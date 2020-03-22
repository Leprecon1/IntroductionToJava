package com.company;

import java.util.Arrays;

public class Calendar {
    private Day[] days;

    public Calendar(Day[] days) {
        this.days = days.clone();
    }

    public void output(){
        System.out.println("Calendar:");

        for (var i :
                days) {
            System.out.println(i);
        }
    }


}
