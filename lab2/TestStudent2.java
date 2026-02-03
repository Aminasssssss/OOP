package training2;
import java.util.Scanner;



public class TestStudent2 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter name: ");
		
		String name=scanner.nextLine();
		
		System.out.println("Enter ID: ");
		String id= scanner.nextLine();
		
		
		Student2 student= new Student2(name, id);
		
		System.out.println("Name: "+ student.getName());
		System.out.println("ID: "+ student.getId());
		
		System.out.println("Year of study: "+ student.getYearOfStudy());
		
		System.out.println("Press enter to increment the study year: ");
		scanner.nextLine();
		
		System.out.println("Name: "+ student.getName());
		System.out.println("ID: "+ student.getId());
		System.out.println("Year of study: "+ student.getYearOfStudy());
		
		scanner.close();
		
		
		
		
		
		
	}

}
