public class FibonacciChallenge {

    public static void main(String[] args) {
        // Ensure negative numbers are not processed for Fibonacci sequence
        try {
            System.out.println("Fibonacci(5) = " + fibonacci(5));
            System.out.println("Fibonacci(10) = " + fibonacci(10));

            System.out.println("First 8 Fibonacci numbers:");
            printFibonacciSequence(8);

            System.out.println("\nUsing efficient algorithm:");
            System.out.println("Fibonacci(40) = " + efficientFibonacci(40));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int fibonacci(int n) {
        // Base cases for Fibonacci sequence
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci number cannot be negative.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2); // Recursion for Fibonacci
    }

    public static void printFibonacciSequence(int n) {
        // Loop from 0 to n-1 for the correct sequence
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int efficientFibonacci(int n) {
        // Iterative method to avoid recalculating the same values
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci number cannot be negative.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + a;
        }
        return b;
    }
}
