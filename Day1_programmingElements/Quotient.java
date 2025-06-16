package Day1_programmingElements;
import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, q, r;

        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();

        q = num1 / num2;
        r = num1 % num2;

        System.out.printf("The Quotient is %d and Remainder is %d of two number %d and %d", q, r, num1, num2);
    }
}
