package kbtu.oop.lab3.problem1.app;
import kbtu.oop.lab3.problem1.model.*;


public class TestProblem1 {

	public static void main(String[] args) {
		System.out.println("WHEN TO USE INTERFACE:");
        System.out.println("1. Contract only, no implementation");
        System.out.println("2. Multiple behavior inheritance");
        System.out.println("3. Strategy pattern, plugins\n");
        
        PaymentStrategy card = new CreditCardPayment("1234");
        PaymentStrategy crypto = new CryptoPayment("0xABC");
        card.pay(100);
        crypto.pay(50);
        
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Mouse", 25);
        System.out.println("\nComparable result: " + p1.compareTo(p2));
        
        System.out.println("\nWHEN TO USE ABSTRACT CLASS:");
        System.out.println("1. Common implementation for related classes");
        System.out.println("2. Fields, constructors, shared code");
        System.out.println("3. Template method pattern\n");
        
        Vehicle car = new Car("Toyota");
        car.start();
        car.stop();
        
        DataProcessor processor = new CSVProcessor();
        processor.process();
	}

}
