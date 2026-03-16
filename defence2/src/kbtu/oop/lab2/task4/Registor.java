package kbtu.oop.lab2.task4;

public class Registor extends Circuit{
	private double resistance;
	private double potentialDiff;
	
	public Registor(double resistance) {
		this.resistance=resistance;
		potentialDiff=0;
	}
	
	@Override
	public double getResistance(){
		return resistance;
	}
	
	
	public void setPotentialDiff(double V) {
		potentialDiff=V;
	}
	
	
	@Override
	public double getPotentialDiff() {
		return potentialDiff;
		
	}
	@Override
	public void applyPotentialDiff(double V) {
		potentialDiff=V;
	}
	
	

}
