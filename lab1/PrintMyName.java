package test;

import java.util.Scanner;

public class PrintMyName {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		
		String border="+" + "-".repeat(name.length()+2)+ "+";
		String middleLine="| "+name+ " |";
		
		
		System.out.println(border);
		System.out.println(middleLine);
		System.out.println(border);
		scanner.close();
		
		
		

	}

}