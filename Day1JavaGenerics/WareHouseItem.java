
package Day1JavaGenerics;
import java.util.*;

abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) { this.name = name; }
    public abstract void displayInfo();
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
    public void displayInfo() { System.out.println("Electronics: " + name); }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
    public void displayInfo() { System.out.println("Groceries: " + name); }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
    public void displayInfo() { System.out.println("Furniture: " + name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }
}

class DisplayUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }
}

class MainWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("TV"));
        electronics.addItem(new Electronics("Camera"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));
        groceries.addItem(new Groceries("Wheat"));

        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Sofa"));
        furniture.addItem(new Furniture("Desk"));

        System.out.println("--- Warehouse Contents ---");
        DisplayUtil.displayItems(electronics.getItems());
        DisplayUtil.displayItems(groceries.getItems());
        DisplayUtil.displayItems(furniture.getItems());
    }
}
