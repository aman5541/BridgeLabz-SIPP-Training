class Item {
    String name;
    int id, quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagementSystem {
    Item head;

    public void addItem(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) head = newItem;
        else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newItem;
        }
    }

    public void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addItem("Pen", 1, 10, 5.0);
        ims.addItem("Notebook", 2, 5, 20.0);
        ims.displayInventory();
    }
}