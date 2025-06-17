package Day2_ControlFlow.Level1;

import java.util.Scanner;
public class GradeCalulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the marks");
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();

        double avg = (phy + chem + math) / 3.0;
        System.out.println("Average: " + avg);

        if (avg >= 90) System.out.println("Grade: A");
        else if (avg >= 75) System.out.println("Grade: B");
        else if (avg >= 60) System.out.println("Grade: C");
        else System.out.println("Grade: D");
    }
}
