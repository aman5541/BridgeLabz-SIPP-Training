package Day4_Methods;
import java.util.Scanner;
public class LargestDigit {
    public static int findLargestDigit(int number) {
        int max = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Largest digit: " + findLargestDigit(num));
    }
}
