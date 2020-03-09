package com.company;

public class City {
    private boolean isCapital;
    private int area;
    private String name;

    public City(boolean isCapital, int area, String name) {
        this.isCapital = isCapital;
        this.area = area;
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }
}
