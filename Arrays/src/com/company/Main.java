package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] arr=getIntegers();
        printArray(arr);
        sortIntegers(arr);
        printArray(arr);
    }

    private static void sortIntegers(int[] arr) {
        int min = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0;i--){
            for(int j=0; j<i;j++){
                if(arr[j]<arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        if(arr == null)
            return;

        System.out.print("Array : [ ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }

    public static int[] getIntegers() {
        System.out.print("How many elements in the array : ");
        while (true) {
            if(!sc.hasNextInt()){
                System.out.println("Invalid Input!");
                sc.nextLine();
                System.out.print("How many elements in the array : ");
            }else{
                break;
            }
        }
        int num = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[num];
        System.out.println("Input " + num + " integers");

        int count = 0;
        while (count<num){
            System.out.print("Number #" + (count+1)+" : ");
            if(sc.hasNextInt()){
                arr[count] = sc.nextInt();
                sc.nextLine();
                count++;
            }else{
                sc.nextLine();
                System.out.println("Invalid Input");
            }
        }
        return arr;
    }
}
