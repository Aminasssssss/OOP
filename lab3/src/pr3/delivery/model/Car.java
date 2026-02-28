package pr3.delivery.model;

public class Car extends Vehicle{
	private int numberOfSeats;
	
	public Car(String model, double baseCost, Engine engine, int numberOfSeats) {
		super(model, baseCost, engine);
		this.numberOfSeats=numberOfSeats;
		
	}
	
	@Override
	public double calculateDeliveryCost() {
		return baseCost+100;
	}
	
	public double calculateDeliveryCost(double extraWeight) {
		return baseCost+100 + extraWeight*2;
	}
	
	@Override
	public String getVehicleInfo() {
		return super.getVehicleInfo() +"\n"+ "Number of seats: "+ numberOfSeats;
	}
	
	@Override
	public String toString() {
		return "Car{model="+ model+ ", baseCost="+ baseCost+ ", engine="+ engine+ ", numberOfSeats="+ numberOfSeats+ "}";
	}
}
