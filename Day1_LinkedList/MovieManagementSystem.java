class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode prev, next;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieManagementSystem {
    MovieNode head, tail;

    public void addMovie(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director + " - " + temp.year + " - " + temp.rating);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        MovieNode temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.director + " - " + temp.year + " - " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        mms.addMovie("Inception", "Nolan", 2010, 9.0);
        mms.addMovie("Interstellar", "Nolan", 2014, 8.6);
        mms.displayForward();
        mms.displayReverse();
    }
}