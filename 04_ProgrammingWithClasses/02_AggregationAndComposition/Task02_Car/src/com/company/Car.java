package com.company;

public class Car {
  private  String name;
  private Wheel wheel;
  private Engine engine;

    public Car(String name, Wheel wheel, Engine engine) {
        this.name = name;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void drive(){
        System.out.println("car drive");
    }

    public void refuel(){
        System.out.println("машина заправляется");
    }

    public void changeWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
