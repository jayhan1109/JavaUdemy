package com.company;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName()+ " is instance number "+StaticTest.getNumInstance());
        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName()+ " is instance number "+StaticTest.getNumInstance());
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName()+ " is instance number "+StaticTest.getNumInstance());
        StaticTest fourthInstance = new StaticTest("4th Instance");
        System.out.println(fourthInstance.getName()+ " is instance number "+ StaticTest.getNumInstance());
    }
}
