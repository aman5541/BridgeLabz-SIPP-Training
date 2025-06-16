package Day2_ControlFlow.Level1;
import java.util.Scanner;
public class Natural {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();
        if (n>=0){
            int sum =  n * (n+1) / 2;
             System.out.println("Sum of  Natural  number is :"+ sum);

        }
        else{
             System.out.println("Not a Natural number");
        }
    }
    
}
