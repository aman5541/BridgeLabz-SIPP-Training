package Day2_ControlFlow.Level1;
import java.util.Scanner;
public class Vote {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int age = sc.nextInt();
        if (age>=18){
            
        System.out.println("Valid to Vote");
        }
       else{
        System.out.println("Invalid to Vote");
       }


    }
    

}
