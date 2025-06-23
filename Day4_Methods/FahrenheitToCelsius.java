package Day4_Methods;
import java.util.Scanner;
public class FahrenheitToCelsius {
    public static double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = convert(f);
        System.out.println("Temperature in Celsius = " + c);
    }
}
