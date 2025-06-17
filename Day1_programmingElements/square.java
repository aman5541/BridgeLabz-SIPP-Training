package Day1_programmingElements;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double perimeter, side;

        System.out.print("Enter perimeter: ");
        perimeter = in.nextDouble();
        side = perimeter / 4;

        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", side, perimeter);
    }
}
