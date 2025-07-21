
public class FibonacciCompare {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 30;

        long start1 = System.currentTimeMillis();
        System.out.println("Recursive: " + fibonacciRecursive(n));
        long end1 = System.currentTimeMillis();
        System.out.println("Time (Recursive): " + (end1 - start1) + "ms");

        long start2 = System.currentTimeMillis();
        System.out.println("Iterative: " + fibonacciIterative(n));
        long end2 = System.currentTimeMillis();
        System.out.println("Time (Iterative): " + (end2 - start2) + "ms");
    }
}
