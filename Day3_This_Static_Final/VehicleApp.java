class Vehicle {
    static double registrationFee = 500.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    void showDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Fee: " + registrationFee);
        }
    }
}
public class VehicleApp {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", "Raj", "Car");
        v1.showDetails();
        Vehicle.updateRegistrationFee(750.0);
        v1.showDetails();
    }
}
