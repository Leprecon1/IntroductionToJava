package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Rest rs = new Rest("Отдых",new String[]{"Туристический автобус", "Яхта", "Дережабль"}, new String[]{"все включено", "полный пансион"} );
        Excursion ex = new Excursion("Экскурсия",new String[]{"Экскурсионный автобус", "подводное судно","планнер"}, new String[]{"все включено", "Завтрак"} );
        Treatment tr = new Treatment("Лечение",new String[]{"прокат автомобиля", "такси", "самолет"}, new String[]{"полупансион", "полный пансион"} );
        Shopping sp = new Shopping("Шопинг",new String[]{"самолет", "туристический автобус", "лайнер"}, new String[]{"без питания", "завтрак"} );
        Cruise cr = new Cruise("Круиз",new String[]{"плоты", "гребные лодки", "морские суда"}, new String[]{"все включено", "полный пансион"} );

        System.out.println("Для сортировки введите команду : sort");
        System.out.println( rs);
        System.out.println( ex);
        System.out.println( tr);
        System.out.println(sp);
        System.out.println(cr);
        
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("введите название путевки");
            String a = sc.next();
            switch (a){
                case "Отдых":
                    rs.getATicket();
                    System.out.println(rs.displayInfo());
                    break;
                case "Экскурсия":
                    ex.getATicket();
                    System.out.println(ex.displayInfo());
                    break;
                case "Лечение":
                    tr.getATicket();
                    System.out.println(tr.displayInfo());
                    break;
                case "Шопинг":
                    sp.getATicket();
                    System.out.println(sp.displayInfo());
                    break;
                case "Круиз":
                    cr.getATicket();
                    System.out.println(cr.displayInfo());
                    break;
                case "sort":
                    Voucher[] vc = new Voucher[]{rs,ex,tr,sp,cr};
                    Comparator<Voucher> comparator = Comparator.comparing(Voucher:: getName);
                    Arrays.sort(vc,comparator);
                    for (var i :
                            vc) {
                        System.out.println(i);
                    }
                    break;
            }
        }
    }
}
