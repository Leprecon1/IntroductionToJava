package com.company;

public class Flower {
    private String name;
    private String grade;

    public Flower(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
