package kbtu.oop.practice4.problem2.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable{
	public Student(String name) {
		super(name);
	}
	@Override
	public void eatPizza() {
		System.out.println("Student is eating pizza");
	}
	
	@Override 
	public void retakeExam() {
		System.out.println("Student is retaking exam");
	}
	
	@Override 
	public void move() {
		System.out.println("Student is moving");

	}
	@Override 
	public void dance() {
		System.out.println("Student is dancing");

	}
	

}
