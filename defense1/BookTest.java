package kbtu.oop.lab1.problem2;

public class BookTest {

	public static void main(String[] args) {
        
        System.out.println("Publisher: " + Book.getPublisher());
        Book.setPublisher("OOP Publishing");
        System.out.println("New publisher: " + Book.getPublisher());
        System.out.println("MAX_PRICE: $" + Book.MAX_PRICE);
        
        System.out.println("\n Creating books...");
        
        Book book1 = new Book("978-0134685991", "Java Programming");
        Book book2 = new Book("978-0132350884", "Clean Code", "Robert Martin");
        Book book3 = new Book("978-0201633610", "Design Patterns", 
                              "Gang of Four", 89.99, Genre.SCIENCE);
        
        System.out.println("Total books created: " + Book.getTotalBooksCreated());
        
        System.out.println("\n Book details using toString()...");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        
        System.out.println("\n Testing method overloading...");
        book1.updateDetails(29.99);
        book1.updateDetails(34.99, "New Author");
        book1.updateDetails(39.99, "Updated Author", Genre.NON_FICTION);
        
        System.out.println("\n Updated book1...");
        System.out.println(book1.toString());
        
        System.out.println("\n Testing read-only fields...");
        System.out.println("ISBN (read-only): " + book2.getIsbn());
        System.out.println("Title (read-only): " + book2.getTitle());
	}

}
