package Day5_Inheritance;

class Book {
    String title;
    int publicationYear;
    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
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
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
public class LibraryApp {
    public static void main(String[] args) {
        Author author = new Author("Java Basics", 2020, "Ravi Kumar", "Expert in Java");
        author.displayInfo();
    }
}
