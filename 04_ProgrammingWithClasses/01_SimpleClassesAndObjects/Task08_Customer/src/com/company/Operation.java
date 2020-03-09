package com.company;


import java.util.Arrays;

public class Operation {
    Customer[] customers;

    public Operation( Customer[] ct) {
        customers = ct.clone();
    }

    public Customer[] sortBySurname(){
        Arrays.sort(customers);
        return  customers;
    }
}
