public class Library {
     String title;
     String author;
     double price;
     boolean isAvailable;

    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Available: " + isAvailable);
    }
    public static void main(String[] args) {
       
          Library book1 = new Library("Histroy of 1983","john doe",30.43);
         
          
          book1.printDetails();
       
}
}
