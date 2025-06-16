
    
import java.util.Scanner;
class Distance {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double feet, yards, miles;
    System.out.print("Enter distance in feet: ");
    feet = in.nextDouble();

    yards = feet / 3;
    miles = yards / 1760;

    System.out.println("Distance in yards: " + yards);
    System.out.println("Distance in miles: " + miles);
  }
}

