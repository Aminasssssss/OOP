package kbtu.oop.practice4.problem1;

public class Main {

	public static void main(String[] args) {
		//1. What is the core difference between a class and an interface?
		//A class defines both state (fields) and behavior (method implementations), and can be instantiated. 
		//An interface defines only a contract (abstract methods) without implementation and cannot be instantiated.
		
		//2. Can interfaces have fields? If yes, what are the implicit modifiers for them?
		//Yes, interfaces can have fields. They are implicitly public static final, 
		//meaning they are constants and cannot be changed.
		
		//3. Can a class implement multiple interfaces? Explain why this is useful.
		//Yes, a class can implement multiple interfaces. 
		//This is useful because Java does not allow a class to extend more than one class, 
		//so interfaces allow a class to inherit multiple types of behavior. 
		//For example, a Student can be both CanHavePizza and Movable at the same time.
	}

}
