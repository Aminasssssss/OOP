package kbtu.oop.lab2.task3;

public class CheckingAccount extends Account{
	private int transactionCount;
	private static final int FREE_TRANSACTIONS=3;
	
	public CheckingAccount(int accNumber) {
		super(accNumber);
		transactionCount=0;
	}
	
	@Override 
	public void deposit(double sum) {
		super.deposit(sum);
		transactionCount++;
	}
	
	
	@Override 
	public void withdraw(double sum) {
		super.withdraw(sum);
		transactionCount++;
	}
	
	@Override 
	public void transfer(double amount, Account other) {
		super.transfer(amount, other);
		transactionCount++;
	}
	
	public int getTransactionCount() {
		return transactionCount;
	}
	
	public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extra = transactionCount - FREE_TRANSACTIONS;
            double transactionFee = extra * 0.02;
            
            if (getBalance() >= transactionFee) {
                withdraw(transactionFee);
            }
        }
        transactionCount = 0;
    }
	
	@Override
	public String toString() {
		return super.toString()+ ", transactions="+ transactionCount;
		
	}

}
