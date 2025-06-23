package Day4_Methods;
import java.util.Scanner;
public class PrimeDigitCounter {
    public static boolean isPrime(int digit) {
        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
    }
    public static int countPrimeDigits(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (isPrime(digit)) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number of prime digits: " + countPrimeDigits(num));
    }
}
