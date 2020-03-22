package com.company;

import TreasureHandling.DragonCave;

import java.util.Scanner;

public class TreasuresRun {

    public static void main(String[] args) {
        DragonCave dragonCave = new DragonCave();
        while (true){
            System.out.println();
            System.out.println("1. Просмотреть сокровище");
            System.out.println("2. Найти самое дорогое сокровище");
            System.out.println("3. Найти сокровище на определенную сумму");
            System.out.println("4. Просмотр всех сокровищ");
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            switch (a){
                case "1":
                    System.out.println("Введите номер сокровища");
                    int number = sc.nextInt();
                    dragonCave.viewTreasure(number);
                    break;
                case "2":
                    dragonCave.chooseTheMostExpensiveTreasure();
                    break;
                case "3":
                    System.out.println("Введите сумму");
                    int sum = sc.nextInt();
                    dragonCave.viewTreasureOnChooseSum(sum);
                    break;
                case "4":
                    dragonCave.allTreasures();
                    break;
            }
        }
    }
}
