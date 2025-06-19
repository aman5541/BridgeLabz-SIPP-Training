package Day4_Methods;

import java.util.Scanner;

public class InterestCal {

    
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

       
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        
        System.out.printf (
            "total interst is:" +
            simpleInterest, principal, rate, time
        );

       
    }
}
