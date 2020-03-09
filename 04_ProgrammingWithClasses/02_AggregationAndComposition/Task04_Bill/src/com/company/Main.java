package com.company;

public class Main {

    public static void main(String[] args) {
        Account ac1 = new Account(1,0);
        Account ac2 = new Account(2,10000);
        Account ac3 = new Account(3,-200);
        Account ac4 = new Account(4,-5);

        Customer ct = new Customer("customer1");
        ct.openAccount(ac1);
        ct.openAccount(ac2);
        ct.openAccount(ac3);
        ct.openAccount(ac4);

        ct.replenishAccount(1,10);
        System.out.println();
        ct.withdrawMoneyFromTheAccount(1,5);
    }
}
