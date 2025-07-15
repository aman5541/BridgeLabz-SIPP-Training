abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
    public double getRentalRate() { return rentalRate; }
    public String getType() { return type; }
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Basic Car Insurance"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Two-wheeler Insurance"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }
    public double calculateRentalCost(int days) { return getRentalRate() * days + 1000; }
    public double calculateInsurance() { return 5000; }
    public String getInsuranceDetails() { return "Heavy Vehicle Insurance"; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("KA01AB1234", 1500),
            new Bike("KA05XY7890", 500),
            new Truck("KA09TR4567", 3000)
        };
        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " Rental: ₹" + v.calculateRentalCost(3));
        }
    }
}