package test;

import java.util.Scanner;

public class savingAccount {

	public static void main(String[] args) {
		Scanner scanner= new scanner(System.in);
		
		double balance=scanner.nextDouble();
		double rate= scanner.nextDouble();
		double interest= balance*rate/100;
		double newBalance= balance+interest;
		
		System.out.println(newBalance);
		System.out.println(interest);
		
		scanner.close();
		
		
		
		
		
	}

}
