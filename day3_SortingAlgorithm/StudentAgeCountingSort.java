import java.util.Scanner;

public class StudentAgeCountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];
        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int max = 18, min = 10;
        int range = max - min + 1;
        int[] count = new int[range];

        for (int age : ages) {
            count[age - min]++;
        }

        int idx = 0;
        for (int i = 0; i < range; i++) {
            while (count[i]-- > 0) {
                ages[idx++] = i + min;
            }
        }

        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}