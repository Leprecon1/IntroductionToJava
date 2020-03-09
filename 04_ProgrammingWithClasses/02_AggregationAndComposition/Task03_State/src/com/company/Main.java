package com.company;

public class Main {

    public static void main(String[] args) {
        City ct1 = new City(true,120,"cityCapital");
        City ct = new City(false,13,"another city");
        Region rg = new Region(134,"region");
        District dt1 = new District(123,"district1");
        District dt2 = new District(150,"district2");

        State st = new State();
        st.addCity(ct);
        st.addCity(ct1);
        st.addRegion(rg);
        st.addDistrict(dt1);
        st.addDistrict(dt2);
        System.out.println("Capital : "+st.findCapital());
        System.out.println("count regions : " + st.countRegions());
        System.out.println("all districts:");
        st.allDistrict();
        System.out.println("state square = " + st.generalArea());
    }
}
