import java.util.*;
class Maximum{
  public static void main(String[] a) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    System.out.println("Max handshakes: " + (n * (n - 1) / 2));
  }
}

