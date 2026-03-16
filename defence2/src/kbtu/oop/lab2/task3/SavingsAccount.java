package kbtu.oop.lab2.task3;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public SavingsAccount(int accNumber, double interestRate) {
		super(accNumber);
		this.interestRate=interestRate;
	}
	
	public void addInterest() {
		double interest = getBalance() * interestRate /100;
		deposit(interest);
	}
	
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		if(interestRate>=0) {
			this.interestRate=interestRate;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+ ", rate="+ interestRate;
	}
	
}
