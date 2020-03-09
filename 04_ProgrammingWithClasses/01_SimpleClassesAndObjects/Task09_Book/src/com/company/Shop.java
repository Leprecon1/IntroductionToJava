package com.company;

import java.util.ArrayList;

public class Shop {
    Book[] bk;

    public Shop(Book[] bk) {
        this.bk = bk.clone();
    }

    public ArrayList<String> listByAuthor(String author){
        ArrayList<String> ls = new ArrayList<String>();
        for (int i = 0; i < bk.length; i++){
            if(bk[i].getAuthor().equals(author)){
                ls.add(bk[i].getName());
            }
        }
        return ls;
    }

    public ArrayList<String> listByPublishing(String pub){
        ArrayList<String> ls = new ArrayList<String>();
        for (int i = 0; i < bk.length; i++){
            if(bk[i].getpublishingHouse().equals(pub)){
                ls.add(bk[i].getName());
            }
        }
        return ls;
    }

    public ArrayList<String> listAfterGivenYear(int year){
        ArrayList<String> ls = new ArrayList<String>();
        for (int i = 0; i < bk.length; i++){
            if(bk[i].getYear() > year){
                ls.add(bk[i].getName());
            }
        }
        return ls;
    }
}
