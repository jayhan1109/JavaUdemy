package com.company;

public class Meat {
    private String meatType;
    private int price;

    public Meat(int type) {
        switch (type){
            case 1:
                this.meatType = "pork";
                this.price=3;
                break;
            case 2:
                this.meatType = "vegan";
                this.price=5;
                break;
            case 3:
                this.meatType = "beef";
                this.price=7;
                break;
            default:
                this.meatType = "chicken";
                this.price=2;
                break;
        }
    }

    public String getMeatType() {
        return meatType;
    }

    public int getPrice() {
        return price;
    }

    public void setMeatType(int type) {
        switch (type){
            case 1:
                this.meatType = "pork";
                this.price=3;
                break;
            case 2:
                this.meatType = "vegan";
                this.price=5;
                break;
            case 3:
                this.meatType = "beef";
                this.price=7;
                break;
            default:
                this.meatType = "chicken";
                this.price=2;
                break;
        }
    }
}
