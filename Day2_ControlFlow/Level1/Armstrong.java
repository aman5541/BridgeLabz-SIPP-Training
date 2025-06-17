package Day2_ControlFlow.Level1;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num = sc.nextInt(), 
        sum = 0, 
        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        System.out.println(num + (sum == num ? " is Armstrong" : " is Not Armstrong"));
    }
}

