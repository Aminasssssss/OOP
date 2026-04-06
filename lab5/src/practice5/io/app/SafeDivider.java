package practice5.io.app;

import java.util.Scanner;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        boolean running= true;
        
        while(running) {
        	try {
        	System.out.print("Enter first integer: ");
        	int x1= Integer.parseInt(scanner.nextLine());
        	
        	System.out.print("Enter second integer: ");
        	int x2= Integer.parseInt(scanner.nextLine());
        	
        	System.out.println("Result: "+ x1+ "/"+ x2+ "="+ (x1/x2));
        	running=false;
        	}
        	
        	catch(ArithmeticException e) {
            	System.out.println("Error: Division by zero!");
            	
            }
            catch(NumberFormatException e) {
            	System.out.println("Error: Please enter valid integers!");
            	
            }
        }
        scanner.close();
        
        
        
        
    }
    
}
