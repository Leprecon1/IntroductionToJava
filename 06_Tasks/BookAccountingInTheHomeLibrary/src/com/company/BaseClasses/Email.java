package com.company.BaseClasses;


public class Email {
    private String name;

    public Email(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

