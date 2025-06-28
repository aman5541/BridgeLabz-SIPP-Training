import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void showBooks() {
        for (Book b : books) {
            System.out.println("Title: " + b.title + ", Author: " + b.author);
        }
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");

        
        Library lib = new Library();

        
        lib.addBook(b1);
        lib.addBook(b2);

        
        lib.showBooks();
    }
}
