package com.company.BaseClasses;

import java.util.List;

public class Catalog {
    private User user;
    private List<Book> books;

    public Catalog(User user, List<Book> books) {
        this.user = user;
        this.books = books;
    }

    public User getUser() {
        return user;
    }
    public List<Book> getBooks() {
        return books;
    }
}
