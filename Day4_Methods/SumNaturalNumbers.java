package Day4_Methods;
import java.util.Scanner;
public class SumNaturalNumbers {
    public static int sumUsingLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int sum = sumUsingLoop(n);
        System.out.println("Sum of " + n + " natural numbers is: " + sum);
    }
}
