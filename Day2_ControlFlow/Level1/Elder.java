package Day2_ControlFlow.Level1;

import java.util.Scanner;

public class Elder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1, age2, age3;
        double h1, h2, h3;

        System.out.println("Enter Amar's age & height:");
        age1 = sc.nextInt(); h1 = sc.nextDouble();

        System.out.println("Enter Akbar's age & height:");
        age2 = sc.nextInt(); h2 = sc.nextDouble();

        System.out.println("Enter Anthony's age & height:");
        age3 = sc.nextInt(); h3 = sc.nextDouble();

         String youngest;
        if (age1 <= age2 && age1 <= age3) {
            youngest = "Amar";
        } else if (age2 <= age1 && age2 <= age3) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        // Tallest
         String Tallest;
        if (age1 <= age2 && age1 <= age3) {
            Tallest = "Amar";
        } else if (age2 <= age1 && age2 <= age3) {
            Tallest = "Akbar";
        } else {
            Tallest= "Anthony";
        }
        

        System.out.println("Youngest among 3 : " + youngest);
        System.out.println("tallest among 3  : " + Tallest);
    }
}
