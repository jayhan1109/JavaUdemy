package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//          -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//          -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//          -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//          -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//          -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//          -Finally, print the minimum element in the array.
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name eMinElementChallengef
        int[] arr=readIntegers(5);
        findMin(arr);
    }

    public static int[] readIntegers(int count){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[count];
        System.out.println("Input "+count+" integers");
        for(int i=0;i<count;i++){
            System.out.print("Integer #"+(i+1)+" = ");
            while(!sc.hasNextInt()){
                System.out.println("Invalid Input");
                sc.nextLine();
                System.out.print("Integer #"+(i+1)+" = ");
            }

            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        return arr;
    }

    public static void findMin(int[] arr){
        int tmp = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<tmp)
                tmp = i;
        }

        System.out.println("Min Value : "+tmp);
    }
}
