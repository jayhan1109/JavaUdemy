package com.company;


class Car {
    private String name;
    private String model;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;
    protected int speed;

    public Car(String name, String model, int cylinders, int doors) {
        this.name = name;
        this.model = model;
        this.engine = false;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
        this.speed=0;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean startEngine(){
        engine= !engine;
        return engine;
    }

    public int accelerate(){
        speed+=5;
        return speed;
    }

    public int brake(){
        speed-=5;
        return speed;
    }
}

class Ford extends Car{
    public Ford(String name, String model, int cylinders, int doors) {
        super(name, model, cylinders, doors);
    }


    @Override
    public int accelerate() {
        speed+=7;
        return speed;
    }

    @Override
    public int brake() {
        speed-=7;
        return speed;
    }
}

class Benz extends Car{
    public Benz(String name, String model, int cylinders, int doors) {
        super(name, model, cylinders, doors);
    }
}


public class Main {

    public static void main(String[] args) {
	    Ford ford = new Ford("Ford","BI-12",4,4);
	    Benz benz = new Benz("Benz","TE-32",6,2);

        System.out.println("Ford Speed : "+ford.getSpeed());
        System.out.println("Ford SPEED UP");
        ford.accelerate();
        System.out.println("Ford Speed : "+ford.getSpeed());

        System.out.println("Benz Speed : "+benz.getSpeed());
        System.out.println("Benz SPEED UP");
        benz.accelerate();
        System.out.println("Benz Speed : "+benz.getSpeed());

    }
}
