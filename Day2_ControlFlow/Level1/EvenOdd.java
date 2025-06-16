package Day2_ControlFlow.Level1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        }

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an Even number");
            } else {
                System.out.println(i + " is an Odd number");
            }
        }
    }
}
