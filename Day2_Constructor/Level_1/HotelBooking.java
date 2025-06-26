public class HotelBooking {
     String guestName;
     String roomType;
     int nights;

    
    public HotelBooking() {
        
    }

   
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void printDetails() {
        System.out.println("Guest: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
    }
    public static void main(String[] args) {
       
         HotelBooking hotel1 = new HotelBooking("Aman Singh","Delux",2);
         HotelBooking hotel2 = new HotelBooking(hotel1);
          
          hotel1.printDetails();
          hotel2.printDetails();
    }
}
