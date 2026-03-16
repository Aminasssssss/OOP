package kbtu.oop.lab2.task4;

public class Parallel extends Circuit{
	private Circuit c1;
	private Circuit c2;
	private double V;
	
	public Parallel(Circuit c1, Circuit c2) {
		this.c1=c1;
		this.c2=c2;
		V=0;
	}
	@Override 
	public double getResistance() {
		double r1= c1.getResistance();
		double r2= c2.getResistance();
		return 1/((1/r1)+ (1/r2));
	}
	
	@Override
	public double getPotentialDiff() {
		return V;
	}
	
	@Override
	public void applyPotentialDiff(double V) {
		this.V=V;
		c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
	}
	

}
