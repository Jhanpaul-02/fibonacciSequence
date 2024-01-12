import java.util.Scanner;

public class Main {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Fibonacci Sequence");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fibonacciCache = new long[n + 1];

        for (int i = 0; i <= n;i++){
            System.out.print(fibonacci(i)+ " ");
//            System.out.println(fibonacci(i));
        }
        System.out.println("\nThe last number of the Fibonacci Sequence is: " + fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n <= 1){
            return n;
        }

        if (fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}