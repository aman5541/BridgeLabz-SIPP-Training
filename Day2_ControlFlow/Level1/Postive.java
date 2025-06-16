package Day2_ControlFlow.Level1;
import java.util.Scanner;
public class Postive {
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();

    if (num>0){
        System.out.println("Postive number");
    }
     else if(num<0){
         System.out.println("Negative number");}
     else if (num == 0){
         System.out.println("Zero");
     }

}
    
}
