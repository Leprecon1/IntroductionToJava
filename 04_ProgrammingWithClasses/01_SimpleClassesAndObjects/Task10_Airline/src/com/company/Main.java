package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Airline ar1 = new Airline("Greece",12,"special",13,"Monday");
        Airline ar2 = new Airline("Greece",19,"passenger",19,"Sunday");
        Airline ar3 = new Airline("Russia",20,"special",8,"Monday");
        Airline[] airlines = new Airline[]{ar1,ar2,ar3};
        Airport ap = new Airport(airlines);
        System.out.println("Номер рейса:");
        output(ap.listByDestination("Greece"));
        System.out.println("Номер рейса:");
        output(ap.listDaysOfWeek("Monday"));
        System.out.println("Номер рейса:");
        output(ap.listDaysOfWeekAndDepartureTime("Monday",11));
    }

    public static void output(ArrayList<Integer> ls){
        for (int s :
                ls) {
            System.out.println(s);
        }
    }
}
