package kbtu.oop.lab3.problem1.model;

public class CryptoPayment implements PaymentStrategy{
	private String walletAddress;
	
	public CryptoPayment(String walletAddress) {
		this.walletAddress=walletAddress;
	}
	
	@Override
	public void pay(double amount) {
        System.out.println("Paid: " + amount + ", crypto: " + walletAddress);

	}
	

}
