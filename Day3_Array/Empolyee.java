package Day3_Array;

import java.util.Scanner;

public class Empolyee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] service = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Enter salary: ");
            double s = sc.nextDouble();
            System.out.print("Enter years of service: ");
            int y = sc.nextInt();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input, try again.");
                i--;
                continue;
            }

            salary[i] = s;
            service[i] = y;
            bonus[i] = (y > 5) ? s * 0.05 : s * 0.02;
            newSalary[i] = s + bonus[i];
            totalBonus += bonus[i];
            totalOld += s;
            totalNew += newSalary[i];
        }

      
        System.out.println("\n--- Summary ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Emp " + (i + 1) + ": Salary=" + salary[i] + ", Bonus=" + bonus[i] + ", New=" + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    
    }
}

