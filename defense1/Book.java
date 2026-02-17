package kbtu.oop.lab1.problem2;

class Genre{
	public static final int FICTION=1;
	public static final int NON_FICTION=2;
	public static final int SCIENCE=3;
	public static final int HISTORY=4;
	public static final int BIOGRAPHY=5;
	public static final int CHILDREN=6;
}

public class Book {
	private final String isbn;
	private final String title;
	private String author;
	private double price;
	private int genre;
	private static String publisher="Unknown Publisher";
	private static int totalBooksCreated=0;
	public static final double MAX_PRICE=1000.0;
	
	
	public Book(String isbn, String title) {
		this.isbn=isbn;
		this.title=title;
		this.author="Unknown";
		this.price=9.99;
		this.genre= Genre.FICTION;
		totalBooksCreated++;
	}
	
	public Book(String isbn, String title, String author) {
		this.isbn=isbn;
		this.title=title;
		this.author=author;
		this.price=9.99;
		this.genre=Genre.FICTION;
		totalBooksCreated++;
	}
	
	public Book(String isbn, String title, String author, double price, int genre) {
		this.isbn=isbn;
		this.title= title;
		this.author=author;
		
		if(price>0 && price<=MAX_PRICE) {
			this.price=price;
			
		}
		else {
			this.price= 9.99;
		
		}
		this.genre=genre;
		totalBooksCreated++;
		
	}
	
	public void updateDetails(double price) {
		if(price>0 && price<=MAX_PRICE) {
			this.price=price;
		}
	}
	public void updateDetails(double price, String author) {
		if(price>0 && price<=MAX_PRICE) {
			this.price=price;
		}
		this.author=author;
	}
	public void updateDetails(double price, String author, int genre) {
		if(price>0 && price<=MAX_PRICE) {
			this.price=price;
		}
		this.author=author;
		this.genre=genre;
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
		this.author=author;
	}
	
	public double getPrice() {
        return price;
    }
	
	public void setPrice(double price) {
        if (price > 0 && price <= MAX_PRICE) {
            this.price = price;
        }
    }
	public int getGenre() {
        return genre;
    }
    
    public void setGenre(int genre) {
        this.genre = genre;
    }
    
    
    
    public static String getPublisher() {
    	return publisher;
    	
    }
    public static void setPublisher(String newPublisher) {
    	publisher= newPublisher;
    }
    
    
    
    public static int getTotalBooksCreated() {
    	return totalBooksCreated;
    	
    }
    
    public String toString() {
    	String genreName;
    	
    	if(genre== Genre.FICTION) {
    		genreName="FICTION";
    	}
    	else if(genre==Genre.NON_FICTION) {
    		genreName="NON_FICTION";
    	}
    	else if(genre== Genre.SCIENCE) {
    		genreName="SCIENCE";
    	}
    	else if(genre== Genre.HISTORY) {
    		genreName="HISTORY";
    	}
    	else if(genre==Genre.BIOGRAPHY) {
    		genreName="BIOGRAPHY";
    	}
    	else if(genre==Genre.CHILDREN) {
    		genreName="CHILDREN";
    	}
    	
    	else {
    		genreName="UNKNOWN";
    	}
    	
    	return "Book[isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + ", genre=" + genreName + ", publisher=" + publisher+"]";
    }
    
    
    


}
