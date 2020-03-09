package com.company;

import java.util.ArrayList;

public class Airport {
    Airline[] al;

    public Airport(Airline[] al) {
        this.al = al.clone();
    }

    public ArrayList<Integer> listByDestination(String destination){
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < al.length; i++){
            if(al[i].getDestination().equals(destination)){
                ls.add(al[i].getFlightNumber());
            }
        }
        return ls;
    }

    public ArrayList<Integer> listDaysOfWeek(String day){
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < al.length; i++){
            if(al[i].getDayOfWeek().equals(day)){
                ls.add(al[i].getFlightNumber());
            }
        }
        return ls;
    }

    public ArrayList<Integer> listDaysOfWeekAndDepartureTime(String day, int time){
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < al.length; i++){
            if(al[i].getDayOfWeek().equals(day) && al[i].getDepartureTime() > time){
                ls.add(al[i].getFlightNumber());
            }
        }
        return ls;
    }


}
