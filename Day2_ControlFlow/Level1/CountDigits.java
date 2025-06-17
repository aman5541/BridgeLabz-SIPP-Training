package Day2_ControlFlow.Level1;

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
        int num = sc.nextInt(), 
        count = 0;

        while (num != 0) {
            num = num/10;
            count++;
        }

        System.out.println("Total digits: " + count);
    }
}
