package Day3_Array;

   import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nAnalysis of each number:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        System.out.println("\nComparison of first and last element:");
        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are Equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than last.");
        } else {
            System.out.println("First element is Less than last.");
        }

       
    }
}

