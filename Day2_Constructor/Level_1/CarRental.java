public class CarRental {
     String customerName;
     String carModel;
     int rentalDays;
   final double dailyRate = 50.0; 

    public CarRental() {
        
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public void printDetails() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
                ", Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
    }
    public static void main(String[] args) {
       
         CarRental car1 = new CarRental( "Aman singh","Hundayi verna",5);
        
          
          car1.printDetails();
          
}
}
