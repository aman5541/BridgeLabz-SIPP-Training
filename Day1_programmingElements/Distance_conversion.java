package Day1_programmingElements;
import java.util.Scanner;

public class Distance_conversion{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double feet, yards, miles;

        System.out.print("Enter distance in feet: ");
        feet = in.nextDouble();

        yards = feet / 3;
        miles = yards / 1760;

       System.out.printf("The distance in yards is %.2f while the distance in miles is %.4f", yards, miles);
    }
}
