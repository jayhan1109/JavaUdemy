package jay.learning;

public class Main {

    public static void main(String[] args) {

    }

    public static void numberToWords(int number) {
        if(number<0)
            System.out.println("Invalid Value");
        else{
            int val;
            int digits;
            int tmp;
            val=reverse(number);
            digits=getDigitCount(number);

            for(int i=1; i<=digits;i++){
                tmp=val%10;
                val/=10;
                switch (tmp){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;
                }
            }
        }
    }

    public static int getDigitCount(int number){
        if(number<0)
            return -1;

        if(number==0)
            return 1;

        int digits=0;
        while(number>0){
            digits++;
            number/=10;
        }

        return digits;
    }

    public static int reverse(int number){
        int num=number;
        int reverse = 0;
        int tmp=0;
        while(Math.abs(num)>0){
            tmp=num%10;
            reverse*=10;
            reverse+=tmp;
            num/=10;
        }

        return reverse;
    }
}
