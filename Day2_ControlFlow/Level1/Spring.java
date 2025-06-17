package Day2_ControlFlow.Level1;
import java.util.Scanner;

public class Spring {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
      System.out.println ("Enter the  month(between 1 to 12)");
      int month = sc.nextInt();
      System.out.println ("Enter the  day(between 1 to 31) ");
      int day = sc.nextInt();
       boolean isSpring = false;

      if ((month == 3 && day >= 20 && day <= 31) ||    
            (month == 4 && day >= 1 && day <= 30) ||     
            (month == 5 && day >= 1 && day <= 31) ||     
            (month == 6 && day >= 1 && day <= 20)) {     
            isSpring = true;
        }
       if(isSpring){
        System.out.println("It is a Spring Season");

       }
       else{
        System.out.println("It is not a Spring Season");

       }
    }
    
}
