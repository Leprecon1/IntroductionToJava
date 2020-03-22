package com.company;

public class Day {
    private int year;
    private int month;
    private int number;
    private boolean dayOff;

    public Day(int year, int month, int number, boolean dayOff) {
        this.year = year;
        this.month = month;
        this.number = number;
        this.dayOff = dayOff;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getNumber() {
        return number;
    }

    public boolean isDayOff() {
        return dayOff;
    }

    @Override
    public String toString() {
        return "Day{" +
                "year=" + year +
                ", month=" + month +
                ", number=" + number +
                ", dayOff=" + dayOff +
                '}';
    }
}
