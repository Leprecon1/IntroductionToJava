package TreasureHandling;

import java.util.Random;

public class DragonCave {
    Treasure[] treasures = new Treasure[100];

    public DragonCave() {
        Random rd = new Random();
        for (int i = 0; i < treasures.length; i++) {
            treasures[i] = new Treasure(i+1,rd.nextInt(100));
        }
    }

    public void allTreasures(){
        for (var i:
             treasures) {
            System.out.println(i);
        }
    }

    public void viewTreasure(int number){
        for (int i = 0; i < treasures.length; i++){
            if (treasures[i].getNumber() == number){
                System.out.println(treasures[i]);
            }
        }
    }

    public void chooseTheMostExpensiveTreasure() {
        int maxNumber = 0;
        int maxIndex = 0;
       for (int i = 0; i < treasures.length; i++){
           if (treasures[i].getCost() > maxNumber){
               maxNumber = treasures[i].getCost();
               maxIndex = i;
           }
       }
        System.out.println(treasures[maxIndex]);
    }

    public void viewTreasureOnChooseSum(int sum){
        boolean b = false;
        for (int i = 0; i < treasures.length; i++){
            if (treasures[i].getCost() == sum){
                b = true;
                System.out.println(treasures[i]);
                break;
            }
        }
        if (!b){
            System.out.println("no treasure for a given sum");
        }
    }
}

