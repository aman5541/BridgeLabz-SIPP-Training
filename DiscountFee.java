 import java.util.Scanner;
 
 public class DiscountFee {
    public static void main(String[] args) { 
         Scanner input = new Scanner(System.in);
        int fee = input.nextInt();
        int discount_per_percent =input.nextInt();
        
         int discount_amount = ( fee * discount_per_percent)/100;
         int new_amount = fee-discount_amount;
          System.out.println(new_amount);
}
}