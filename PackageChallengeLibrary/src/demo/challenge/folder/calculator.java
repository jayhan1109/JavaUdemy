package demo.challenge.folder;

public class calculator {

    public static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int nFactorial(int n){
        if(n==0)
            return 0;

        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }

        return factorial;
    }

    public static int nFibonacci(int n){
        if(n==0)
            return 0;

        if(n==1)
            return 1;

        int fibonacci=0;
        for(int i=2;i<=n;i++){
            fibonacci+=nFactorial(i-1)+nFactorial(i-2);
        }

        return fibonacci;
    }
}
