package Day1_programmingElements;
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        double miles = km / 1.6;
        System.out.println("Distance in miles: " + miles);
        input.close();
    }
}
