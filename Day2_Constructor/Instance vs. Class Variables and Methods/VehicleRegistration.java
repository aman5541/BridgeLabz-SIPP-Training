public class VehicleRegistration {
    private String ownerName;
    private String vehicleType;

   
    private static double registrationFee = 500.0; 

    
    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

   
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }
}
