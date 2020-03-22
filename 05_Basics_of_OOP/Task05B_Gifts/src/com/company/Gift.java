package com.company;

public class Gift {
    private Sweets[] sweets;
    private Packaging packaging;

    public Gift(Sweets[] sweets, Packaging packaging) {
        this.sweets = sweets.clone();
        this.packaging = packaging;
    }

    public void create(){
        if (sweets.length < 3){
            System.out.println("Слишком мало сладостей :D");
            return;
        }
        System.out.println("Подарок успешно создан");
        System.out.println("сладости:");
        for (var i :
             sweets) {
            System.out.println(i);
        }
        System.out.println("Упковка: " + packaging );
    }
}
