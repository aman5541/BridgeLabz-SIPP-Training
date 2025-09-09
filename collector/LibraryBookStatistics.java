package collector;

import java.util.*;
import java.util.stream.*;

class LibraryBookStatistics {
    static class Book {
        String genre;
        int pages;
        Book(String genre, int pages) { this.genre = genre; this.pages = pages; }
        String getGenre() { return genre; }
        int getPages() { return pages; }
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 500),
            new Book("Non-Fiction", 250),
            new Book("Non-Fiction", 450),
            new Book("Sci-Fi", 600)
        );

        Map<String, IntSummaryStatistics> stats = books.stream()
            .collect(Collectors.groupingBy(Book::getGenre,
                    Collectors.summarizingInt(Book::getPages)));

        System.out.println(stats);
    }
}

