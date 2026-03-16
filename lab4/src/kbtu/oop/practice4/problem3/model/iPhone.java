package kbtu.oop.practice4.problem3.model;

public class iPhone implements SellableAndPluggable{
	@Override
	public void sell() {
		System.out.println("iPhone is being sold");
	}
	@Override
	public void plug() {
		System.out.println("iPhone is plugged in");
	}

}
