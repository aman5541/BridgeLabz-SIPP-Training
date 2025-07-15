package WorkShop;

import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSpots = 10;
        int occupied = 0;
        int choice;

        while (true) {
            System.out.println("1. To Park the Car");
            System.out.println("2. To Exit Your Car");
            System.out.println("3. Show occupancy");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (occupied < totalSpots) {
                        occupied++;
                        System.out.println("Car parked. Total occupied: "+ occupied );
                       
                    }
                    else {
                        System.out.println("Parking full.");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Car exited. Total occupied: " + occupied);
                    }
                    else {
                        System.out.println("No cars to exit.");
                    }
                    break;

                case 3:
                    System.out.println("Occupied: " + occupied + "/" + totalSpots);
                    break;

                case 4:
                    System.out.println(" THANK YOU , You Exit from Parking System.");
                    return;
                 default:
                   System.out.println("Invalid choice.");
        }     

            if (occupied == totalSpots) {
                System.out.println("Parking lot is full now.");
                break;
            }
           
        }
    }
}

