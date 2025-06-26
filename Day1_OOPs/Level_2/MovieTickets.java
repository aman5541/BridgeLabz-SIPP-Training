public class MovieTickets {
     String movieName;
     String seatNumber;
     double price;

    public void MovieTickets(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.printf("Price: $%.2f%n", price);
    }

    public static void main(String[] args) {
        MovieTickets ticket = new MovieTickets();
        ticket.MovieTickets("Panchayat", "A10", 12.5);
        ticket.displayTicketDetails();
    }
}

    

