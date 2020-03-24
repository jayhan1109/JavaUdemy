package jay.learning;

public class Main {

    public static void main(String[] args) {
        // Exercise 1 test
        // SpeedConverter.java
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);

        // Exercise 2 test
        // MegaBytesConverter.java
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        // Exercise 3 test
        // BarkingDog.java
        BarkingDog.shouldWakeUp(true, 1);
        BarkingDog.shouldWakeUp(false, 2);
        BarkingDog.shouldWakeUp(true, 8);
        BarkingDog.shouldWakeUp(true, -1);

        // Exercise 4 test
        // LeapYear.java
        LeapYear.isLeapYear(-1600);
        LeapYear.isLeapYear(1600);
        LeapYear.isLeapYear(2017);
        LeapYear.isLeapYear(2000);

        // Exercise 5 test
        // DecimalComparator.java
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);

        // Exercise 6 test
        // EqualSumChecker.java
        EqualSumChecker.hasEqualSum(1, 1, 1);
        EqualSumChecker.hasEqualSum(1, 1, 2);
        EqualSumChecker.hasEqualSum(1, -1, 0);

        // Exercise 7 test
        // TeenNumberChecker.java
        TeenNumberChecker.hasTeen(9, 99, 19);
        TeenNumberChecker.hasTeen(23, 15, 42);
        TeenNumberChecker.hasTeen(22, 23, 34);

        TeenNumberChecker.isTeen(9);
        TeenNumberChecker.isTeen(13);
    }
}
