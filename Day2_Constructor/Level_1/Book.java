public class Book {
     String title;
     String author;
     double price;

    
    public Book() {
       
    }

    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
    public static void main(String[] args) {
       
         Book book1 = new Book("Himalayam", "Aman Singh", 39.99);
          Book book2 = new Book();
          book1.printDetails();
          book2.printDetails();
    }
}
