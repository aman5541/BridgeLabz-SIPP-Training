package Day4_Methods;
import java.util.Scanner;
public class FirstLastDigitDifference {
    public static int differenceFirstLast(int number) {
        int last = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int first = number;
        return Math.abs(first - last);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Difference of first and last digits = " + differenceFirstLast(num));
    }
}
