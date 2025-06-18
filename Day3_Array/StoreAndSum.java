package Day3_Array;
import java.util.Scanner;

public class StoreAndSum {
    public static void main (String[] Args){
 
        Scanner input = new Scanner(System.in);
        Double number[] = new Double[10];
         Double total = 0.0;
         int index = 0;

         while(true){
            System.out.println("Enter the number (0 or nnegative to stop)");
            Double nums = input.nextDouble();

            if (nums <= 0 || index == 10){
                     break;
            }
            number[index]= nums;
            index++;

         }
          System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(number[i]);
            total += number[i];
        }
         System.out.println("Total sum of numbers = " + total);
    }
    }
 