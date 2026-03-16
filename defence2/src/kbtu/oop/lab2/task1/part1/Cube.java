package kbtu.oop.lab2.task1.part1;

public class Cube extends Shape3D {
	private double side;
	
	public Cube(double side) {
		this.side=side;
	}
	
	
	
	
	@Override
	public double volume() {
		return Math.pow(side, 3);
	}
	
	@Override
	public double surfaceArea() {
		return 6 * Math.pow(side, 2);
	}
	
	

}
