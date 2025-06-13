import java.util.Scanner;
public class Height_conversion {
     public static void main(String[] args) { 
         Scanner input = new Scanner(System.in);
        int Height = input.nextInt();
        double Height_in_inches = Height/2.54;
        double Height_in_foot = Height/30.48;
        System.out.println(" Height in inches =" + Height_in_inches);
        System.out.println(" Height in foot =" + Height_in_foot);
}
}