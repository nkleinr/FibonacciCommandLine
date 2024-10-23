public class FibonacciCommandLine {
    public static void main(String[] args) {
        // Check if the user has provided exactly one command-line argument
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer argument.");
            return;
        }

        try {
            // Parse the command-line argument as an integer
            int n = Integer.parseInt(args[0]);

            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
                return;
            }

            System.out.println("Fibonacci sequence up to " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciIterative(i) + " ");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer.");
        }
    }

    // Iterative method to compute Fibonacci numbers
    public static int fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
