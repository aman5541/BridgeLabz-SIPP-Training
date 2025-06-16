package Day1_programmingElements;
import java.util.Scanner;

public class Purchase_price {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double unitPrice, total;
        int quantity;

        System.out.print("Enter unit price: ");
        unitPrice = in.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = in.nextInt();

        total = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f", total, quantity, unitPrice);
    }
}

