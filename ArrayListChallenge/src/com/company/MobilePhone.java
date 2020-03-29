package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    Scanner sc = new Scanner(System.in);

    String name;
    String phoneNumber;

    public void init() {
        boolean quit = false;
        menu();
        while (!quit) {
            System.out.println("Select Option>> ");
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Invalid Input.");
                System.out.println("Select Option>> ");
            }
            int select = sc.nextInt();
            sc.nextLine();
            switch (select){
                case 0:
                    menu();
                    break;
                case 1:
                    print();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    quit=true;
                    break;
                default:
                    System.out.println("Input between 0 and 6");
                    break;
            }
        }
    }

    private void menu() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - Menu");
        System.out.println("\t 1 - Print all contacts");
        System.out.println("\t 2 - Add");
        System.out.println("\t 3 - Modify");
        System.out.println("\t 4 - Remove");
        System.out.println("\t 5 - Search");
        System.out.println("\t 6 - To quit the application");
    }

    private void print(){
        for(Contact c : contacts){
            System.out.println(c.getName()+" - "+c.getPhoneNumber());
        }
    }

    private void add(){
        getInput();

        int index = find(name,phoneNumber);
        if(index==-1){
            contacts.add(new Contact(name,phoneNumber));
        }else{
            System.out.println("Already exist!");
        }
    }

    private void remove(){
        getInput();

        int index = find(name,phoneNumber);
        if(index!=-1){
            contacts.remove(index);
        }else{
            System.out.println("Not exist");
        }
    }

    private void modify(){
        getInput();

        int index = find(name,phoneNumber);
        if(index!=-1){
            System.out.println("New Phone Number\n>>");
            phoneNumber = sc.nextLine();
            contacts.get(index).setPhoneNumber(phoneNumber);
        }else{
            System.out.println("Not exist");
        }
    }

    private void search(){
        System.out.print("Name\n>>");
        name = sc.nextLine();
        int index = find(name);
        if(index!=-1){
            System.out.println("Name : " + contacts.get(index).getName());
            System.out.println("Phone Number : " + contacts.get(index).getPhoneNumber());
        }else{
            System.out.println("Not exist");
        }
    }

    private int find(String name, String phoneNumber){
        for(int i=0; i<contacts.size();i++){
            if(contacts.get(i).findOne(name,phoneNumber))
                return i;
        }
        return -1;
    }

    private int find(String name){
        for(int i=0; i<contacts.size();i++){
            if(contacts.get(i).findOne(name))
                return i;
        }
        return -1;
    }

    private void getInput(){
        System.out.print("Name\n>>");
        name = sc.nextLine();
        System.out.println("Phone Number\n>>");
        phoneNumber = sc.nextLine();
    }
}
