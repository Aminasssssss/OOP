package kbtu.oop.lab2.task3;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int accNumber) {
		this.accNumber=accNumber;
		balance =0.0;
	}
	public void deposit(double sum) {
		if(sum>0) {
			balance =balance +sum;
		}
	}
	public void withdraw(double sum) {
		if(sum>0 && sum<=balance) {
			balance= balance-sum;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	public double getAccountNumber() {
		return accNumber;
	}
	
	
	public void transfer(double amount, Account other) {
		if(amount>0 && amount<=balance) {
			this.withdraw(amount);
			other.deposit(amount);
		}
	}
	
	@Override
	public String toString() {
		return "Account "+ accNumber+ ": balance="+ balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
	
	
	
	

}
