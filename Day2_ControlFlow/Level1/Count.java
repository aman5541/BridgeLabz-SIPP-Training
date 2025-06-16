package Day2_ControlFlow.Level1;
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      System.out.println("please enter intial input");
      int count = input.nextInt();
        while(count >=1){
           System.out.println(count); 
           count--;
        }
           System.out.println("Rocket can lunch");
    }
    
}
