package Day2_ControlFlow.Level1;
import java.util.Scanner;

public class InfiniteWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int sum = 0;
     while (true) {
          System.out.println("please enter  input number");
           int number = sc.nextInt();
         if(number<=0){
            break;
         }
           sum = sum+number;

     }
       System.out.println("Final Sum : "+sum);
  }  
}
