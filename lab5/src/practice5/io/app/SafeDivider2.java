package practice5.io.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivider2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        boolean running = true;
        
        
        while (running) {
            try {
                System.out.print("Enter first integer: ");
                int x1 = scan.nextInt();

                System.out.print("Enter second integer: ");
                int x2 = scan.nextInt();

                System.out.println("Result: " + x1 + "/" + x2 + "=" + (x1 / x2));
                running = false;

            } 
            catch (ArithmeticException e) {
                System.out.println("Error: Division by zero!");
            } 
            catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Error: Please enter valid integers!");
            }
        }
        scan.close();
        
	}

}
