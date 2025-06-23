package Day4_Methods;
import java.util.Scanner;
public class SmallestDigit {
    public static int findSmallestDigit(int number) {
        int min = 9;
        while (number != 0) {
            int digit = number % 10;
            if (digit < min) {
                min = digit;
            }
            number /= 10;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Smallest digit: " + findSmallestDigit(num));
    }
}
