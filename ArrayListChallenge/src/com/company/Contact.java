package com.company;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean findOne(String name, String phoneNumber){
        return this.name.equals(name) && this.phoneNumber.equals(phoneNumber);
    }

    public boolean findOne(String name){
        return this.name.equals(name);
    }
}
