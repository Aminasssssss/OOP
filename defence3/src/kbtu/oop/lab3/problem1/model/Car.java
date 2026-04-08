package kbtu.oop.lab3.problem1.model;

public class Car extends Vehicle{
	public Car(String brand) {
		super(brand);
	}
	
	@Override
	public void start() {
        System.out.println(brand + " car started");
    }

}
