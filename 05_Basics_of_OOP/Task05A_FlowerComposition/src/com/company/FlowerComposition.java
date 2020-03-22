package com.company;

import java.util.Arrays;

public class FlowerComposition {
    Flower[] flowers;
    Packaging packaging;

    public FlowerComposition(Flower[] flowers, Packaging packaging) {
        this.flowers = flowers.clone();
        this.packaging = packaging;
    }

    public void create() {
        if (flowers.length < 3){
            System.out.println("Слишком мало цветов для создания композиции");
            return;
        }
        System.out.println("Композиция создана");
        System.out.println("цветки:");
        for (var i :
                flowers) {
            System.out.println(i);
        }
        System.out.println("Упаковка : " + packaging);
    }


}
