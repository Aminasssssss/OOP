package test;

import java.util.Scanner;
import java.lang.Math;


public class quadratic {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		double c=scanner.nextDouble();
		
		double D=b*b-4*a*c;
		
		System.out.println(D);

		
		if(D>0) {
			double sqrtD=Math.sqrt(D);
			
			double x1=(-b+sqrtD)/(2*a);
			double x2=(-b-sqrtD)/(2*a);
			
			System.out.println(x1);
			System.out.println(x2);

			
		}
		else if(D==0) {
			double x =-b/(2*a);
			System.out.println(x);
			
		}
		else {
			System.out.println("Error");

		}
		scanner.close();
		
	}

}
