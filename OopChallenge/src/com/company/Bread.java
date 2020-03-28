package com.company;

public class Bread {
    private String breadType;
    private int price;

    public Bread(int type) {
        switch (type){
            case 1:
                this.breadType = "cheese";
                this.price=3;
                break;
            case 2:
                this.breadType = "vegan";
                this.price=5;
                break;
            case 3:
                this.breadType = "chocolate";
                this.price=7;
                break;
            default:
                this.breadType = "milk";
                this.price=2;
                break;
        }
    }

    public String getBreadType() {
        return breadType;
    }

    public int getPrice() {
        return price;
    }

    public void setBreadType(int type) {
        switch (type){
            case 1:
                this.breadType = "cheese";
                this.price=3;
                break;
            case 2:
                this.breadType = "vegan";
                this.price=5;
                break;
            case 3:
                this.breadType = "chocolate";
                this.price=7;
                break;
            default:
                this.breadType = "milk";
                this.price=2;
                break;
        }
    }
}
