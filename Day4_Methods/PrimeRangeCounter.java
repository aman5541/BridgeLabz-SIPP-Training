package Day4_Methods;
import java.util.Scanner;
public class PrimeRangeCounter {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int countPrimesInRange(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int n = sc.nextInt();
        System.out.println("Number of primes between 1 and " + n + ": " + countPrimesInRange(n));
    }
}
