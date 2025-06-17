package Day2_ControlFlow.Level1;
import java .util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System .out.println("Enter the 1 rd number");
        int n1 = sc.nextInt();
         System .out.println("Enter the 2 rd number");
        int n2 = sc.nextInt();
        System .out.println("Enter the 3 rd number");
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3){
              System.out.println("n1 is smallest number");
        }
        else{
             System.out.println("n1 is not smallest number");
        }
    }
    
}
