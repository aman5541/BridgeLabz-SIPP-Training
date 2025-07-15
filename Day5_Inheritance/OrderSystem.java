package Day5_Inheritance;

class Order {
    int orderId;
    String orderDate;

    Order(int id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String tracking) {
        super(id, date);
        this.trackingNumber = tracking;
    }

    String getOrderStatus() {
        return super.getOrderStatus() + ", Shipped with tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return super.getOrderStatus() + ", Delivered on: " + deliveryDate;
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(1001, "2025-07-01", "TRK123456", "2025-07-03");
        System.out.println(order.getOrderStatus());
    }
}
