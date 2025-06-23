package Day4_Methods;
import java.util.Scanner;
public class DigitOccurrence {
    public static int countDigitOccurrence(int number, int digitToFind) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit == digitToFind) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter digit to count: ");
        int digit = sc.nextInt();
        System.out.println("Digit " + digit + " occurs " + countDigitOccurrence(number, digit) + " time(s).");
    }
}
