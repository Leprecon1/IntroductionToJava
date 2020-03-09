package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Customer {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public Customer(String name) {
        this.name = name;
    }

    public void openAccount(Account Account){
        accounts.add(Account);
    }

    public void replenishAccount(int idAccount, int sum){
        if (!isAccountExist(idAccount))
            System.out.println("such an account does not exist");
        for (var i :
                accounts) {
            if (i.getId() == idAccount){
                if (i.isBlock()) {
                    System.out.println("account has been blocked");
                    return;
                }
                i.addBalance(sum);
                System.out.printf("account number %d successful replenished \n", i.getId());
                System.out.println("our balance = " + i.getBalance());
            }
        }
    }

    public void  withdrawMoneyFromTheAccount(int idAccount, int sum){
        if (!isAccountExist(idAccount))
            System.out.println("such an account does not exist");
        for (var i :
                accounts) {
            if (i.getId() == idAccount){
                if (i.isBlock()) {
                    System.out.println("your account is blocked");
                    return;
                }
                i.reduceBalance(sum);
                System.out.printf("account number %d money successfully withdrawn \n", i.getId());
                System.out.println("our balance = " + i.getBalance());
            }
        }
    }

    public void toBlockedAccount(int idAccount) {
        if (!isAccountExist(idAccount))
            System.out.println("such an account does not exist");
        for (var i :
                accounts) {
            if (i.getId() == idAccount) {
                i.toBlock();
                System.out.println("account blocked");
            }
        }

    }

    public void unlockAccount(int idAccount) {
        if (!isAccountExist(idAccount))
            System.out.println("such an account does not exist");
        for (var i :
                accounts) {
            if (i.getId() == idAccount) {
                i.unlock();
                System.out.println("account unlocked");
            }
        }
    }

    public boolean isAccountExist(int idAccount){
        for (var i :
                accounts) {
            if (i.getId() == idAccount)
                return true;
        }
        return false;
    }

    public void findAccount(int idAccount){
        if (!isAccountExist(idAccount))
            System.out.println("such an account does not exist");
        for (var i :
                accounts) {
            if (i.getId() == idAccount)
                System.out.println(i);
        }
    }

    public ArrayList<Account> sortAccounts(){
        Comparator<Account> comparator1 = Comparator.comparing(Account::getId);
        accounts.sort(comparator1);
        return accounts;
    }

    public int generalSum(){
        int balance = 0;
        for (var i :
                accounts) {
            balance+=i.getBalance();
        }
        return balance;
    }

    public int negativeBalanceAmount(){
        int balance = 0;
        for (var i :
                accounts) {
            if (i.getBalance() < 0)
            balance+=i.getBalance();
        }
        return balance;
    }

    public int positiveBalanceAmount(){
        int balance = 0;
        for (var i :
                accounts) {
            if (i.getBalance() > 0)
                balance+=i.getBalance();
        }
        return balance;
    }
}
