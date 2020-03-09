package com.company;

import java.util.ArrayList;

public class State {
    private ArrayList<City> cities = new ArrayList<City>();
    private ArrayList<Region> regions = new ArrayList<Region>();
    private ArrayList<District> districts = new ArrayList<District>();

    public void addCity(City city){
        this.cities.add(city);
    }

    public void addRegion(Region region){
        this.regions.add(region);
    }

    public void addDistrict(District district){
        this.districts.add(district);
    }

    public String findCapital(){
        for (var ct :
                cities) {
            if (ct.isCapital())
                return  ct.getName();
        }
        return "could not find the capital";
    }

    public int countRegions(){
        return  regions.size();
    }

    public  void allDistrict(){
        for (var i :
                districts) {
            System.out.println(i.getName());
        }
    }

    public int generalArea(){
        int area = 0;
        for (var i :
                cities) {
            area+=i.getArea();
        }
        for (var n :
                regions) {
            area+=n.getArea();
        }
        for (var j :
                districts) {
            area+=j.getArea();
        }
        return area;
    }

}
