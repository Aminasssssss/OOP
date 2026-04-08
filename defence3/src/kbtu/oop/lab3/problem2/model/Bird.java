package kbtu.oop.lab3.problem2.model;

public class Bird implements Flyable{
	private String name;
	
	public Bird(String name) {
		this.name=name;
	}
	
	
	@Override
	public void move() {
        System.out.println(name + " is moving");
    }
    
	@Override
    public void fly() {
        System.out.println(name + " is flying");
    }

}
