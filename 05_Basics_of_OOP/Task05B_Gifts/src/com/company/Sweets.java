package com.company;

public class Sweets {

    private String name;
    private String producer;

    public Sweets(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
