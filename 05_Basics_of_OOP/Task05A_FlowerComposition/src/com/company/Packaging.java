package com.company;

public class Packaging {
    private String name;
    private String category;
    private String color;

    public Packaging(String name, String category, String color) {
        this.name = name;
        this.category = category;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
