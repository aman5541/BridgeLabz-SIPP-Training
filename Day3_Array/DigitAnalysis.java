package Day3_Array;

import java.util.Scanner;

public class DigitAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        
        while (number != 0) {
            int digit = number % 10;
            digits[index] = digit;
            index++;

            if (index == maxDigit) {
                break;
            }

            number = number / 10;
        }
        int largest = -1;
        int secondLargest = -1;


      for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

       
        System.out.println("\nDigits in the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);

        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (all digits may be same)");
        }

        
    }
}
