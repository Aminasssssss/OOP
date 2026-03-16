package kbtu.oop.lab2.task1.part2;

public class Book extends LibraryItem{
	private int numberOfPages;
	
	
	public Book(String title, String author, int publicationYear, int numberOfPages) {
		super(title, author, publicationYear);
		this.numberOfPages=numberOfPages;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		if(numberOfPages>0) {
			this.numberOfPages=numberOfPages;
		}
	}
	
	@Override 
	public String toString() {
		return "Book=> "+ super.toString()+ ", page: "+ numberOfPages;
	}
	

}
