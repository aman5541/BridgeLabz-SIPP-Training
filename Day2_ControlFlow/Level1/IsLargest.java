package Day2_ControlFlow.Level1;
import java.util.Scanner;
public class IsLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System .out.println("Enter the 1 rd number");
        int n1 = sc.nextInt();
         System .out.println("Enter the 2 rd number");
        int n2 = sc.nextInt();
        System .out.println("Enter the 3 rd number");
        int n3 = sc.nextInt();

         boolean isFirstLargest = (n1 > n2) && (n1 > n3);

        boolean isSecondLargest = (n2 > n1) && (n2 > n3);
        boolean isThirdLargest = (n3 > n1) && (n3 > n2);
        
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
    }   
    
}
