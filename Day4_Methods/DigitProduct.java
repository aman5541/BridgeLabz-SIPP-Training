package Day4_Methods;
import java.util.Scanner;
public class DigitProduct {
    public static int productOfDigits(int number) {
        int product = 1;
        while (number != 0) {
            product *= number % 10;
            number /= 10;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Product of digits = " + productOfDigits(num));
    }
}
