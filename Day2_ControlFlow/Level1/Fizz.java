package Day2_ControlFlow.Level1;

import java.util.Scanner;

public class Fizz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
          
        }
        int i = 1;
        while (i <= num) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            else {
                System.out.println(i);
            }
            i++;
        }
    }
}
