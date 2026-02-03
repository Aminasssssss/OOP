package test;

import java.util.Scanner;


public class palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        scanner.close();
        
        String lower = input.toLowerCase();
        
        boolean isPalindrome = lower.equals(
            new StringBuilder(lower).reverse().toString()
        );
        
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No");
        }

	}

}
