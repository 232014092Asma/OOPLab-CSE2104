import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int year;
    private static String genre; 

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void setGenre(String genre) {
        Book.genre = genre;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }

    public static void displayTotalBooks(ArrayList<Book> books) {
        System.out.println("Total number of books: " + books.size());
    }
}
