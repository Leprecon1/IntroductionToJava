package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer cm = new Customer(1,"Mil","Mail","tyn","50 street",432,12);
        Customer cm1 = new Customer(2,"Nil","Hom","Teryls","30 street",111,5);
        Customer cm2 = new Customer(3,"Kim","Kol","Venil","11 street",123,1);
        Customer[] customers = new Customer[]{cm,cm1,cm2};

        Operation op = new Operation(customers);
        System.out.println("1 список покупателей в алфавитном порядке");
        System.out.println("2 список покупателей у которых кредитная карточка находится в заданном интревале");
        System.out.println();
        while (true){
            Scanner sn = new Scanner(System.in);
            String a = sn.next();
            switch (a){
                case "1":
                    Output(op.sortBySurname());
                    break;
                case "2":
                    System.out.println("Введите начало диапозона");
                    int n = sn.nextInt();
                    System.out.println("Введите конец диапозона");
                    int n1 = sn.nextInt();
                    for (int i = 0; i < customers.length; i++){
                        if (customers[i].getCreditNumber() >= n &&
                                customers[i].getCreditNumber() <= n1 ){
                            System.out.println(customers[i]);
                        }
                    }
                    break;
            }
        }

    }
    private  static void Output(Customer[] ct){
        for (var i :
                ct) {
            System.out.println(i);
        }
    }
}
