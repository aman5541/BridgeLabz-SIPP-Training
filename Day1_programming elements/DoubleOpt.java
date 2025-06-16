import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.print("Enter value of a: ");
        a = in.nextDouble();
        System.out.print("Enter value of b: ");
        b = in.nextDouble();
        System.out.print("Enter value of c: ");
        c = in.nextDouble();

        System.out.println("The results of Double Operations are:");
        System.out.println( (a + b * c));
        System.out.println( (a * b + c));
        System.out.println( (c + a / b));
        System.out.println((a % b + c));
    }
}
