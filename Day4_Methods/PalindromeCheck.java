package Day4_Methods;
import java.util.Scanner;
public class PalindromeCheck {
    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (isPalindrome(num))
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
    }
}
