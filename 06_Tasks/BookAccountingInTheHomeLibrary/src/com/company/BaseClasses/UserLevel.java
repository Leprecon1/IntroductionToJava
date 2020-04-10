package com.company.BaseClasses;

public enum UserLevel {
    ADMIN("admin"), USER("user");
    private String name;

    UserLevel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
