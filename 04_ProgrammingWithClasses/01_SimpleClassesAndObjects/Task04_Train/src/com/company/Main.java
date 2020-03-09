package com.company;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Train tr = new Train("name1", 23,11);
        Train tr1 = new Train("name2", 11,20);
        Train tr2 = new Train("name3", 17,8);
        Train tr3 = new Train("name1", 25,24);
        Train tr4 = new Train("name5", 33,30);
        Train[] trains = new Train[]{tr,tr1,tr2,tr3,tr4};

        System.out.println("1.сортировка по номерам поезда");
        System.out.println("2.вывод информации поезда по номеру");
        System.out.println("3.сортировка по пункту назначения");
        while (true){
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            switch (a){
                case "1":
                    Comparator<Train> comparator = Comparator.comparing(Train::getTrainNumber);
                    Arrays.sort(trains,comparator);
                    output(trains);
                    break;
                case "2":
                    System.out.println("Введите номер поезда");
                    int number = sc.nextInt();
                    for (int i = 0; i < trains.length; i++){
                        if (trains[i].getTrainNumber() == number)
                            System.out.println(trains[i]);
                    }
                    break;
                case "3":
                    Comparator<Train> comparator1 = Comparator.comparing(Train::getDestinationName);
                    comparator1 = comparator1.thenComparing(Train::getTimeSend);
                    Arrays.sort(trains,comparator1);
                    output(trains);
                    break;
            }
        }
    }

    private static void output(Train[] trains){
        for (var i :
                trains) {
            System.out.println(i);
        }
    }
}
