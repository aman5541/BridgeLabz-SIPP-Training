package Day1_programmingElements;
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        int result1, result2, result3, result4;

        System.out.print("Enter value of a: ");
        a = in.nextInt();
        System.out.print("Enter value of b: ");
        b = in.nextInt();
        System.out.print("Enter value of c: ");
        c = in.nextInt();

        result1 = a + b * c;       
        result2 = a * b + c;       
        result3 = c + a / b;       
        result4 = a % b + c;       

        System.out.printf("The results of Int Operations are %d, %d, %d, and %d", result1, result2, result3, result4);
    }
}

