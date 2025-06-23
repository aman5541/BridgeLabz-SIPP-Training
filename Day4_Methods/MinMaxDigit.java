package Day4_Methods;
import java.util.Scanner;
public class MinMaxDigit {
    public static void findMinMaxDigit(int number) {
        int min = 9, max = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit < min) min = digit;
            if (digit > max) max = digit;
            number /= 10;
        }
        System.out.println("Smallest digit: " + min);
        System.out.println("Largest digit: " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        findMinMaxDigit(num);
    }
}
