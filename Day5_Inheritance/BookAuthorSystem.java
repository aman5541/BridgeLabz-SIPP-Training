package Day5_Inheritance;

class Book {
    String title;
    int publicationYear;

    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class BookAuthorSystem {
    public static void main(String[] args) {
        Author author = new Author("Java Basics", 2023, "James", "Writes technical books.");
        author.displayInfo();
    }
}
