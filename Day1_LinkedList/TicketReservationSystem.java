class TicketNode {
    int ticketId;
    String name, movie, seat, time;
    TicketNode next;

    TicketNode(int id, String name, String movie, String seat, String time) {
        this.ticketId = id;
        this.name = name;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
        this.next = null;
    }
}

public class TicketReservationSystem {
    TicketNode head = null;

    void addTicket(int id, String name, String movie, String seat, String time) {
        TicketNode node = new TicketNode(id, name, movie, seat, time);
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = node;
            node.next = head;
        }
    }

    void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.name + " " + temp.movie + " " + temp.seat + " " + temp.time);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TicketReservationSystem t = new TicketReservationSystem();
        t.addTicket(101, "Ravi", "Inception", "A1", "7:00 PM");
        t.addTicket(102, "Amit", "Matrix", "B2", "8:00 PM");
        t.displayTickets();
    }
}