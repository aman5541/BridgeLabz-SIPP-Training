public class MobilePhone {
    
     String brand;
     String model;
     double price;

    
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: $%.2f%n", price);
    }


    public static void main(String[] args) {
        
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S24", 999.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 1099.00);

        
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}
