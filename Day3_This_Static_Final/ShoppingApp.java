class Product {
    static double discount = 5.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    void showDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}
public class ShoppingApp {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Phone", 15000, 2);
        Product p2 = new Product(102, "Charger", 500, 1);
        p1.showDetails();
        p2.showDetails();
        Product.updateDiscount(10.0);
        p1.showDetails();
    }
}
