package Day4_Methods;
import java.util.Scanner;
public class OddDigitCounter {
    public static int countOddDigits(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) count++;
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number of odd digits: " + countOddDigits(num));
    }
}
