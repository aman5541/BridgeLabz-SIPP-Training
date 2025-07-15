abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Magazine reserved.");
        } else {
            System.out.println("Magazine not available.");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 3;
    }

    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("DVD reserved.");
        } else {
            System.out.println("DVD not available.");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine("M202", "Tech Monthly", "Tech Corp");
        LibraryItem item3 = new DVD("D303", "Inception", "Christopher Nolan");

        Reservable[] reservables = {(Reservable) item1, (Reservable) item2, (Reservable) item3};

        for (LibraryItem item : new LibraryItem[]{item1, item2, item3}) {
            System.out.println(item.getItemDetails() + ", Loan Days: " + item.getLoanDuration());
        }

        for (Reservable r : reservables) {
            System.out.println("Available? " + r.checkAvailability());
            r.reserveItem();
        }
    }
}
