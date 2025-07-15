class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book prev, next;

    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
    }
}

public class LibraryManagementSystem {
    Book head, tail;

    public void addBook(String title, String author, String genre, int id, boolean available) {
        Book newBook = new Book(title, author, genre, id, available);
        if (head == null) head = tail = newBook;
        else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    public void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " - " + temp.author + " - " + temp.genre + " - " + temp.available);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBook("Java", "John", "Tech", 1, true);
        lms.addBook("Python", "Smith", "Tech", 2, false);
        lms.displayForward();
    }
}