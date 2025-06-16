package Day2_ControlFlow.Level1;

import java.util.Scanner;

public class Divisbility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        
        if(number%5 == 0){
            System.out.println( "number is Divisible"); 
        }
        else{
             System.out.println( "number is not Divisible"); 
        }
    }
}
