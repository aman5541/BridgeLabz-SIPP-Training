import java.util.Scanner;

public class area_of_triangle {
     public static void main (String []args){
        Scanner input = new Scanner(System.in);
         System.out.println("Height");
         double Height  = input.nextDouble();

          
        
         System.out.println("base");
          double base = input.nextDouble();

          double Area_in_cm = 0.5*base*Height;
          System.out.println(Area_in_cm);
           double areaInInches = Area_in_cm / 6.4516;
            System.out.println("areaInInches"+areaInInches);
}
}
