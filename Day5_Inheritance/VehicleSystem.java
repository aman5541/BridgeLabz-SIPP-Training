package Day5_Inheritance;
class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int speed, String fuel) {
        this.maxSpeed = speed;
        this.fuelType = fuel;
    }

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int speed, String fuel, int seats) {
        super(speed, fuel);
        this.seatCapacity = seats;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int speed, String fuel, int load) {
        super(speed, fuel);
        this.loadCapacity = load;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}

class Motorcycle extends Vehicle {
    boolean hasHelmetStorage;

    Motorcycle(int speed, String fuel, boolean helmetStorage) {
        super(speed, fuel);
        this.hasHelmetStorage = helmetStorage;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Helmet Storage: " + (hasHelmetStorage ? "Yes" : "No"));
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(180, "Petrol", 5), new Truck(120, "Diesel", 5000),
                new Motorcycle(150, "Petrol", true) };
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("-----------");
        }
    }
}
