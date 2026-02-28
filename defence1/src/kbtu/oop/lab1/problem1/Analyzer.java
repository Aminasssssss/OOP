package kbtu.oop.lab1.problem1;
import java.util.Scanner;


public class Analyzer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data= new Data();
		
		
		while(true) {
			System.out.print("Enter number (Q to quit): ");
			String input= scanner.nextLine();
			
			if(input.equals("Q") || input.equals("q")) {
				break;
			}
			
			boolean isNumber=true;
			double value=0;
			
			
			for(int i=0; i<input.length(); i++) {
				char c=input.charAt(i);
				
				if(c!='.' && c!='-' && (c<'0' || c>'9')) {
					isNumber=false;
					break;
				}
			}
			
			if(isNumber) {
				value= Double.parseDouble(input);
				data.addValue(value);
			}
			else {
				System.out.println("Invalid input! Please enter a valid number or 'Q' to quit.");
				
			}
		}
		
		System.out.println("Average = "+data.getAverage());
		System.out.println("Maximum = "+ data.getMax());
		System.out.println("Data info: "+ data.toString());
		
		
		scanner.close();
	
	}

}
