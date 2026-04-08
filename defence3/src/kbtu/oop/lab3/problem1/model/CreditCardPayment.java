package kbtu.oop.lab3.problem1.model;

public class CreditCardPayment implements PaymentStrategy{
	private String cardNumber;
	
	public CreditCardPayment(String cardNumber) {
		this.cardNumber=cardNumber;
	}
	
	@Override
	public void pay(double amount) {
        System.out.println("Paid: " + amount + ", card: " + cardNumber);

	}

}
