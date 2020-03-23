package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Integer Minimum Value - 1 = " + (myMinIntValue - myValue));
        System.out.println("Integer Maximum Value + 1 = " + (myMaxIntValue + myValue));

//        bigger than Int capacity
//        int myMaxIntTest = 2147483648;

        int camelMaxIntValue1 = 2_147_483_647;
        System.out.println(camelMaxIntValue1);
        int camelMaxIntValue2 = 2_147_48364_7;
        System.out.println(camelMaxIntValue2);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        System.out.println("My Long Value = " + myLongValue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

//        long bigLongLiteralValue = 2_147_483_647_243;
        long bigLongLiteralValue = 2_147_483_647_243L;

        short bigShortLiteralValue = 23767;
        int myTotal = (myMinIntValue/2);

//        byte myNewByteValue = (myMinIntValue/2);
        byte myNewByteValue = (byte)(myMinIntValue/2);

        short myNewShortValue = (short)(myMinShortValue/2);


        ///////////////////////////////////////////
        ////////////// Challenge //////
    }
}
