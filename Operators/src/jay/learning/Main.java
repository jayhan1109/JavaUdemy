package jay.learning;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result / 5; // 20 / 5 = 4;
        System.out.println("20 / 5 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result % 3; // 4 % 3 = 1;
        System.out.println("4 % 3 = " + result);
        System.out.println("previousResult = " + previousResult);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2; // 1 + 2 = 3;
        System.out.println("1 + 2 = " + result);

        double value1 = 20.00d;
        double value2 = 80.00d;
        value1 *= 100.00d;
        value2 *= 100.00d;

        double remainValue1 = value1 % 40.00d;
        double remainValue2 = value2 % 40.00d;
        System.out.println("remainValue1 = " + remainValue1);
        System.out.println("remainValue2 = " + remainValue2);

        boolean value1Zero = (remainValue1 == 0);
        boolean value2Zero = (remainValue2 == 0);

        System.out.println("value1Zero = " + value1Zero);
        System.out.println("value2Zero = " + value2Zero);

    }
}
