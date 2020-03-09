package com.company;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Voucher {
    private String name;
    private String[] transports;
    private String[] nutrition;
    private String MyTransport;
    private String MyNutrition;
    private Integer departureNumber;
    private Integer arrivalNumber;
    private Scanner sc = new Scanner(System.in);

    public Voucher(String name, String[] transports, String[] nutrition) {
        this.name = name;
        this.transports = transports.clone();
        this.nutrition = nutrition.clone();
    }

    private void choiceTransport(){
        System.out.println( Arrays.toString(transports));
        int numberOfTransport = sc.nextInt() - 1;
        setMyTransport(transports[numberOfTransport]);
    }

    private void choiceNutrition(){
        System.out.println( Arrays.toString(nutrition));
        int numberOfNutrition = sc.nextInt() - 1;
        setMyNutrition(nutrition[numberOfNutrition]);
    }

    private void choiceDepartureNumber(){
        int departureNumber = sc.nextInt();
        setDepartureNumber(departureNumber);
    }

    private void choiceArriveNumber(){
        int arriveNumber = sc.nextInt();
        setArrivalNumber(arriveNumber);
    }

    public void getATicket(){
        System.out.println("Выберите номер подходящего транспорта");
        choiceTransport();
        System.out.println("Выберите номер подходящего петания");
        choiceNutrition();
        System.out.println("Введите день выезда");
        choiceDepartureNumber();
        System.out.println("Введите день прибытия");
        choiceArriveNumber();
        System.out.println();
        System.out.println("Путевка успешна зарегистрирована!");
    }

    public String displayInfo(){
        return "Voucher{" +
                "name='" + name + '\'' +
                ", transports=" + getMyTransport() +
                ", nutrition=" + getMyNutrition() +
                ", departureNumber=" + getDepartureNumber() +
                ", arrivalNumber=" + getArrivalNumber() +
                '}';
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "name='" + name + '\'' +
                ", transports=" + Arrays.toString(transports) +
                ", nutrition=" + Arrays.toString(nutrition) +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getMyTransport() {
        return MyTransport;
    }

    public void setMyTransport(String myTransport) {
        MyTransport = myTransport;
    }

    public String getMyNutrition() {
        return MyNutrition;
    }

    public void setMyNutrition(String myNutrition) {
        MyNutrition = myNutrition;
    }


    public Integer getDepartureNumber() {
        return departureNumber;
    }

    public void setDepartureNumber(Integer departureNumber) {
        this.departureNumber = departureNumber;
    }

    public Integer getArrivalNumber() {
        return arrivalNumber;
    }

    public void setArrivalNumber(Integer arrivalNumber) {
        this.arrivalNumber = arrivalNumber;
    }

}
