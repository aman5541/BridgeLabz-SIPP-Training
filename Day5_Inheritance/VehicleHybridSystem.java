package Day5_Inheritance;
interface Refuelable {
    void refuel();
}

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int speed) {
        this.model = model;
        this.maxSpeed = speed;
    }
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int speed) {
        super(model, speed);
    }

    void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int speed) {
        super(model, speed);
    }

    public void refuel() {
        System.out.println(model + " is refueling with petrol.");
    }
}

public class VehicleHybridSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 220);
        PetrolVehicle pv = new PetrolVehicle("Maruti Swift", 180);
        ev.charge();
        pv.refuel();
    }
}
