package Day2_ControlFlow.Level1;
    
import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0; 
        double number;      
        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();
        while (number != 0) {
            total += number;
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }

        
        System.out.println("The total sum is: " + total);
    }
}

