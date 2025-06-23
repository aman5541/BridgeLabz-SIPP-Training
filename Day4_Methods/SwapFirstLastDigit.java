package Day4_Methods;
import java.util.Scanner;
public class SwapFirstLastDigit {
    public static int swapDigits(int number) {
        String numStr = String.valueOf(number);
        if (numStr.length() == 1) return number;
        char first = numStr.charAt(0);
        char last = numStr.charAt(numStr.length() - 1);
        String swapped = last + numStr.substring(1, numStr.length() - 1) + first;
        return Integer.parseInt(swapped);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("After swapping first and last digit: " + swapDigits(num));
    }
}
