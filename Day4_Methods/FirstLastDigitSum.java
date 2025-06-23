package Day4_Methods;
import java.util.Scanner;
public class FirstLastDigitSum {
    public static int sumFirstLast(int number) {
        int last = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int first = number;

        return first + last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of first and last digits = " + sumFirstLast(num));
    }
}
