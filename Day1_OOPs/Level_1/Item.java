
public class Item {
    
     String itemCode;
     String itemName;
     double price;

   
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price per Unit: $%.2f%n", price);
    }

    
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

   
    public static void main(String[] args) {
        Item item = new Item("A101", "Pen", 10.5);
         
        item.displayDetails();

        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.printf("Total cost for %d items: $%.2f%n", quantity, totalCost);
    }
}
