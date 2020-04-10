package com.company.BaseClasses;

public enum BookType {
    PAPER("Paper book"), EBOOK("eBook");
    String name;
    BookType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
