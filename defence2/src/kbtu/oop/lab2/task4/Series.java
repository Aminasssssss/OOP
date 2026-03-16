package kbtu.oop.lab2.task4;

public class Series extends Circuit{
	private Circuit c1;
	private Circuit c2;
	private double V;
	
	public Series(Circuit c1, Circuit c2) {
		this.c1=c1;
		this.c2= c2;
		V=0;
	}
	@Override 
	public double getResistance() {
		return c1.getResistance()+c2.getResistance();
		
	}
	
	@Override 
	public double getPotentialDiff() {
		return V;
	}
	
	@Override 
	public void applyPotentialDiff(double V) {
		this.V=V;
		double I= V/getResistance();
		
		c1.applyPotentialDiff(I* c1.getResistance());
		c2.applyPotentialDiff(I *c2.getResistance());
	}

}
