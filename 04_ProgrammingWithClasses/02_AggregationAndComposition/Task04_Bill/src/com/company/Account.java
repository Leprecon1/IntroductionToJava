package com.company;

public class Account {
    private int id;
    private int balance;
    private boolean isBlock;

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
        if (balance < 0)
            isBlock = true;
        else
            isBlock = false;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public void addBalance(int sum){
        balance+=sum;
    }

    public void reduceBalance(int sum){
        balance-=sum;
    }

    public void toBlock(){
        isBlock = true;
    }

    public void unlock() {
        isBlock = false;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", isBlock=" + isBlock +
                '}';
    }
}
