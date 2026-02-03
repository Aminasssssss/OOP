package test;

import java.util.Scanner;
import java.lang.Math;


public class program {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		double side= scanner.nextDouble();
		if(side<=0) {
			System.out.println("Error");
			
		}
		else {
			double area=side*side;
			double perimeter=side*4;
			double diagonal=side* Math.sqrt(2);
			
			System.out.println(area);
			System.out.println(perimeter);
			System.out.println(diagonal);
			
		}
		scanner.close();
		
	}

}
