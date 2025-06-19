package Day4_Methods;

import java.util.Scanner;

public class NumberChecker{
    public static int checkNumberSign(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = checkNumberSign(number);

        if (result == 1)
            System.out.println("The number is positive.");
        else if (result == -1)
            System.out.println("The number is negative.");
        else
            System.out.println("The number is zero.");

        
    }
}