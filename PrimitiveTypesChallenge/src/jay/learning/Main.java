package jay.learning;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 50000L+10L*(byteValue+shortValue+intValue);
        System.out.println(longValue);
    }
}
