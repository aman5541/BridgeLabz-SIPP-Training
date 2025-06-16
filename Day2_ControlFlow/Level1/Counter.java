package Day2_ControlFlow.Level1;
import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in) ;
       System.out.println("Enter the value");
      int counter = sc.nextInt();
       for(int i=counter; i>0 ;i--){
                   System.out.println(i);
       }
    }
    
}
