import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    List<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) {
            System.out.println(" - " + p.name);
        }
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.showOrder();
    }
}

public class EcommerceApp {
    public static void main(String[] args) {
        Customer cust = new Customer("Aman Singh");

        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        cust.placeOrder(order);
    }
}

