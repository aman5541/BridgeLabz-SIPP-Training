class Book {
    static String libraryName = "City Central Library";
    final String isbn;
    String title;
    String author;
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}
public class LibraryApp {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b = new Book("Java", "John", "ISBN101");
        b.displayDetails();
    }
}
