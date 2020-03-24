package jay.learning;

public class SpeedConverter {
    private final static double MILE_TO_KILO = 1.609;

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour/MILE_TO_KILO);
    }

    public static void printConversion(double kilometersPerHour){
        if(toMilesPerHour(kilometersPerHour)==-1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }
}
