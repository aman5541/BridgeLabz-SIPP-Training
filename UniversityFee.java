public class UniversityFee {
    public static void main(String[] args) { 
        int fee = 125000;
        int discount_per_percent = 10; 
         int discount_amount = ( fee * discount_per_percent)/100;
         int new_amount = fee-discount_amount;
          System.out.println(new_amount);
}
}