package com.company;

public class Main {

    public static void main(String[] args) {
        Day d = new Day(2015,6,14,true);
        Day d1 = new Day(2015,6,15,false);
        Day d2 = new Day(2015,6,16,false);
        Day d3 = new Day(2015,6,17,false);
        Day[] days = new Day[]{d,d1,d2,d3};
        Calendar cld = new Calendar(days);
        cld.output();
    }
}
