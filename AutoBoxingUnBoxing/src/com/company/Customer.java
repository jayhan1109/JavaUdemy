package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTrans(double transaction){
        transactions.add(Double.valueOf(transaction));
    }

    public double findTrans(int index){
        return transactions.get(index);
    }
}
