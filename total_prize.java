
import java.util.*;
class total_prize {
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    double p = s.nextDouble(); int q = s.nextInt();
    System.out.println("The total purchase price is INR " + (p*q) + 
      " if the quantity " + q + " and unit price is INR " + p);
  }
}
