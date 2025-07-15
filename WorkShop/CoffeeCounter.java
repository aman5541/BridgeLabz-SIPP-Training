package WorkShop;

import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String coffeeType;
        double price = 0;
        double gstRate = 0.18;  

        while (true) {
            System.out.println("Enter coffee type (Espresso, Latte, Cappuccino, exit to stop): ");
            coffeeType = scanner.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter quantity of cups: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 100;
                    
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Sorry , this Coffee is not Aviable currently");
                    continue;
            }

            double total = price * quantity;
            double gst = total * gstRate;
            double finalBill = total + gst;

            System.out.println("Total bill: ₹" + total);
            System.out.println("gst: ₹" + gst);
            System.out.println(" GranTotal Bill: ₹" + finalBill);
           
        }

      System.out.println("THANK YOU & VISIT AGAIN");
       
    }
}

