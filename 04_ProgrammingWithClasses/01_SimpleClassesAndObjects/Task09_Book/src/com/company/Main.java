package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       Book bk = new Book(12,"hell","Jon","Gens",2002,100,15,"solid");
       Book bk1 = new Book(17,"night","Nik","Gens",1990,1000,10,"soft");
       Book bk2 = new Book(19,"morning","Jon","Fegur",2012,80,11,"soft");
       Book[] books = new Book[]{bk,bk1,bk2};
       Shop sp = new Shop(books);
       output(sp.listByAuthor("Jon"));
        System.out.println();
       output(sp.listByPublishing("Gens"));
        System.out.println();
    output(sp.listAfterGivenYear(1999));
}

    public static void output(ArrayList<String> ls){
        for (String s :
                ls) {
            System.out.println(s);
        }
    }
}
