package test;

import java.util.Scanner;


public class grade {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int score= scanner.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("Error");
			
			
		}
		else {
			String grade;
			
			if(score>=95) {
				grade="A";
				
			}
			else if(score>=90) {
				grade="A-";
				
			}
			else if(score>=85) {
				grade="B+";
				
			}
			else if(score>=80) {
				grade="B-";
				
			}
			else if(score>=75) {
				grade= "C+";
				
			}
			else {
				grade="C-";
				
			}
			System.out.println(grade);
			
		}
		scanner.close();
		
		
		
		
	}

}
