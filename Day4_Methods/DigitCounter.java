package Day4_Methods;
import java.util.Scanner;
public class DigitCounter {
    public static int countDigits(int number) {
        int count = 0;
        if (number == 0) return 1;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Number of digits: " + countDigits(num));
    }
}

