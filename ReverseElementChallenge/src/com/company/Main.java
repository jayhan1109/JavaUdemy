package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /**
         * -Write a method called reverse() with an int array as a parameter.
         *
         * -The method should not return any value. In other words, the method is allowed to modify the array parameter.
         *
         * -In main() test the reverse() method and print the array both reversed and non-reversed.
         *
         * -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
         *
         * -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
         *
         *
         * Tip:
         * 	-Create a new console project with the name eReverseArrayChallengef
         */

        int[] arr = {3,2,5,1,7};
        reverse(arr);
    }

    public static void reverse(int[] arr){
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));

        int tmp = 0;
        for(int i=0; i<arr.length/2;i++){
            tmp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = tmp;
        }

        System.out.println("Reversed Array");
        System.out.println(Arrays.toString(arr));

    }
}
