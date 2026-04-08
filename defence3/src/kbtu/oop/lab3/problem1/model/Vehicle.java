package kbtu.oop.lab3.problem1.model;

public abstract class Vehicle {
	protected String brand;
	
	public Vehicle(String brand) {
		this.brand=brand;
	}
	
	
	
	public abstract void start();
	
	public void stop() {
        System.out.println(brand + " stopped");

	}

}
