package kbtu.oop.lab1.problem2;

public class Book {
    private final String isbn;
    private final String title;
    
    private String author;
    private double price;
    private Genre genre;
    
    private static String publisher = "Unknown Publisher";
    private static int totalBooksCreated = 0;
    public static final double MAX_PRICE = 1000.0;
    
    public Book(String isbn, String title) {
        this(isbn, title, "Unknown", 9.99, Genre.FICTION);
    }
    
    public Book(String isbn, String title, String author) {
        this(isbn, title, author, 9.99, Genre.FICTION);
    }
    
    public Book(String isbn, String title, String author, double price, Genre genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        
        if (price > 0 && price <= MAX_PRICE) {
            this.price = price;
        } 
        else {
            this.price = 9.99;
        }
        
        this.genre = genre;
        totalBooksCreated++;
    }
    
    public void updateDetails(double price) {
        if (price > 0 && price <= MAX_PRICE) {
            this.price = price;
        }
    }
    
    public void updateDetails(double price, String author) {
        if (price > 0 && price <= MAX_PRICE) {
            this.price = price;
        }
        this.author = author;
    }
    
    public void updateDetails(double price, String author, Genre genre) {
        if (price > 0 && price <= MAX_PRICE) {
            this.price = price;
        }
        this.author = author;
        this.genre = genre;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price > 0 && price <= MAX_PRICE) {
            this.price = price;
        }
    }
    
    public Genre getGenre() {
        return genre;
    }
    
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    public static String getPublisher() {
        return publisher;
    }
    
    public static void setPublisher(String newPublisher) {
        publisher = newPublisher;
    }
    
    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }
    
    @Override
    public String toString() {
        return "Book[isbn=" + isbn + ", title=" + title + ", author=" + author + 
               ", price=" + price + ", genre=" + genre + ", publisher=" + publisher + "]";
    }
}
