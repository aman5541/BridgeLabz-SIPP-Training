package Day4_Methods;
import java.util.Scanner;
public class CompositeDigitCounter {
    public static boolean isComposite(int digit) {
        return digit == 4 || digit == 6 || digit == 8 || digit == 9;
    }
    public static int countCompositeDigits(int number) {
        int count = 0;
        while (number != 0) {
            int digit = number % 10;
            if (isComposite(digit)) {
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
        System.out.println("Number of composite digits: " + countCompositeDigits(num));
    }
}
