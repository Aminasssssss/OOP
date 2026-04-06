package practice5.io.app;

import practice5.io.model.Book;
import java.io.*;
import java.util.*;

public class LibraryManager {
    private static final String FILE_NAME = "library.dat";
    private List<Book> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
        loadLibrary();
    }
    

    private void loadLibrary() {
        File file = new File(FILE_NAME);
        
        
        if (!file.exists()) {
            System.out.println("No existing library found. Starting fresh.");
            return;
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            books = (List<Book>) ois.readObject();
            System.out.println("Loaded "+ books.size() + " books.");
        } 
        
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
    

    
    private void saveLibrary() {
    	try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
    		oos.writeObject(books);
    	}
    	catch(IOException e) {
    		System.out.println("Error: "+ e.getMessage());
    	}
    	
    }
    
    
    private void addBook() {
    	System.out.print("Enter book title: ");
    	String title= scanner.nextLine();
    	
    	System.out.print("Enter author name: ");
    	String author= scanner.nextLine();
    	
    	books.add(new Book(title, author));
    	System.out.println("Book added!");
    }

    
    private void listBook() {
    	if (books.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            books.get(i).incrementVisitCount();
            System.out.println((i + 1) + ". " + books.get(i));
        }
    	
    }
    
    public void run() {
    	boolean running=true;
    	
    	while(running) {
    		System.out.println("\n Enter 'A' to add, 'L' to list, 'Q' to quit");
    		System.out.print("Choice: ");
    		
    		String choice = scanner.nextLine().trim().toUpperCase();
    		
    		switch(choice) {
    		
    		case "A" :
    			addBook(); 
    			break;
    			
    		case "L":
    			listBook();
    			break;
    		
    			
    		case "Q":
    			running=false;
    			saveLibrary();
    			System.out.println("Done!");
    			break;
    			
    			
    		default:
    			System.out.println("Invalid choice");
    			
    		}
    		
    	}
    	scanner.close();
    }
    
    
    public static void main(String[] args) {
        new LibraryManager().run();
    }
    
    
    
    
    
    
    
    
    
    
    
    
}