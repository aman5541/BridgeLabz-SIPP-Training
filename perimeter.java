import java.util.Scanner;
class perimeter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double p, s;
    System.out.print("Enter perimeter: ");
    p = in.nextDouble();
    s = p / 4;
    System.out.println("The length of the side is " + s + " whose perimeter is " + p);
  }
}

