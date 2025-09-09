package collector;

import java.util.*;
import java.util.stream.*;

class OrderRevenueSummary {
    static class Order {
        String customer;
        double total;
        Order(String customer, double total) { this.customer = customer; this.total = total; }
        String getCustomer() { return customer; }
        double getTotal() { return total; }
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 200.0),
            new Order("Bob", 150.0),
            new Order("Alice", 300.0),
            new Order("Charlie", 400.0)
        );

        Map<String, Double> revenue = orders.stream()
            .collect(Collectors.groupingBy(Order::getCustomer,
                    Collectors.summingDouble(Order::getTotal)));

        System.out.println(revenue);
    }
}

