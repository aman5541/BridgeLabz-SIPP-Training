
import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base, height, areaCm, areaIn;

        System.out.print("Enter base (cm): ");
        base = in.nextDouble();
        System.out.print("Enter height (cm): ");
        height = in.nextDouble();

        areaCm = 0.5 * base * height;
        areaIn = areaCm / 6.4516;

        System.out.printf("Area in sq cm: %.2f, Area in sq in: %.2f", areaCm, areaIn);
    }
}
