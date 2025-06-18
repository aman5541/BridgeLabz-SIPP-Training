package Day3_Array;

import java.util.*;

public class MeanHeight {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        Double [] height = new Double[11];
           Double sum = 0.0;
           
        System.out.println("Enter the number");
        for(int i=0; i<= height.length;i++){
              height[i] = input.nextDouble();
             
              sum = sum + height[i];
        }
        System.out.println(sum);
        

          double mean_height = sum / 11;
         System.out.println("the mean height of player : " + mean_height);


    }
}
