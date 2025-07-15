abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String id, String name, double rate) {
        this.vehicleId = id;
        this.driverName = name;
        this.ratePerKm = rate;
    }

    public abstract double calculateFare(double distance);
    public String getVehicleDetails() {
        return driverName + " | Rate per km: ₹" + ratePerKm;
    }

    public double getRatePerKm() { return ratePerKm; }
}

class Car extends Vehicle {
    public Car(String id, String name, double rate) {
        super(id, name, rate);
    }
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Bike extends Vehicle {
    public Bike(String id, String name, double rate) {
        super(id, name, rate);
    }
    public double calculateFare(double distance) {
        return getRatePerKm() * distance - 10;
    }
}

class Auto extends Vehicle {
    public Auto(String id, String name, double rate) {
        super(id, name, rate);
    }
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 5;
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("C01", "Amit", 15),
            new Bike("B01", "Ravi", 10),
            new Auto("A01", "Sonu", 12)
        };
        for (Vehicle v : rides) {
            System.out.println(v.getVehicleDetails() + " | Fare: ₹" + v.calculateFare(10));
        }
    }
}