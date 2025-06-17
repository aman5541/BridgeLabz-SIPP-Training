package Day2_ControlFlow.Level1;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}

