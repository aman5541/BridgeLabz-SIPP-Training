package Day3_Array;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics marks: ");
            physics[i] = sc.nextDouble();
            System.out.print("Chemistry marks: ");
            chemistry[i] = sc.nextDouble();
            System.out.print("Maths marks: ");
            maths[i] = sc.nextDouble();
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Try again.");
                i--;
                continue;
            }
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

            if (percentage[i] >= 90)
                grade[i] = "A";
            else if (percentage[i] >= 75)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }
        System.out.println("\nMarks and Grades:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d - Physics: %.1f, Chemistry: %.1f, Maths: %.1f, Percentage: %.2f%%, Grade: %s\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}
