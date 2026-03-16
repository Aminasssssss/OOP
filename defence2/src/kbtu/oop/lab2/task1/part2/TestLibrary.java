package kbtu.oop.lab2.task1.part2;

public class TestLibrary {

	public static void main(String[] args) {

		Book book1 = new Book("Book One", "Author A", 2000, 300);
        Book book2 = new Book("Book Two", "Author B", 2005, 450);
        
        System.out.println(book1);
        System.out.println(book2);
        
        book1.setNumberOfPages(1300);
        System.out.println("After changes: " + book1);
	}

}
