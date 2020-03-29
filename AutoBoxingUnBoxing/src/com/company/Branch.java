package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private Scanner sc = new Scanner(System.in);

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer){
        if(findCustomer(customer)==-1){
            customers.add(customer);
        }else{
            System.out.println("Already Exist!");
        }
    }

    public void addCustomer(String name){
        if(findCustomer(name)==-1){
            customers.add(new Customer(name));
        }else{
            System.out.println("Already Exist!");
        }
    }

    public void add(String name){
        int index = findCustomer(name);
        if(index!=-1){
            addTransaction(index);
        }
    }

    private void addTransaction(int index){
        System.out.println("How much : ");
        double transaction = sc.nextDouble();
        customers.get(index).addTrans(transaction);
    }

    private int findCustomer(String name){
        for(int i=0; i<customers.size(); i++){
            if(name.equals(customers.get(i).getName()))
                return i;
        }
        return -1;
    }

    private int findCustomer(Customer customer){
        return customers.indexOf(customer);
    }
}
