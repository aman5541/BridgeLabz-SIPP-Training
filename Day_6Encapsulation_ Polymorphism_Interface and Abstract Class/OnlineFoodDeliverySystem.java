abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();
    public String getItemDetails() {
        return itemName + " - Qty: " + quantity + ", Price: ₹" + price;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}

class VegItem extends FoodItem {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 20;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = {
            new VegItem("Paneer", 150, 2),
            new NonVegItem("Chicken", 200, 1)
        };
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails() + " | Total: ₹" + item.calculateTotalPrice());
        }
    }
}