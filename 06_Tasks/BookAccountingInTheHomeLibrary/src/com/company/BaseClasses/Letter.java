package com.company.BaseClasses;


public class Letter {
    private Email recipient;
    private Email sender;
    private Book book;
    private String message;

    public Letter(Email recipient, Email sender, Book book) {
        this.recipient = recipient;
        this.sender = sender;
        this.book = book;
        this.message = "";
    }

    public boolean sendLetter() {
        return true;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "recipient='" + recipient + '\'' +
                ", sender='" + sender + '\'' +
                ", book=" + book +
                ", message='" + message + '\'' +
                '}';
    }
}
