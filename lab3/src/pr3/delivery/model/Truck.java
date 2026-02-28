package pr3.delivery.model;

public class Truck extends Vehicle{
	
	private int maxLoad;
	
	public Truck(String model, double baseCost, Engine engine, int maxLoad) {
		super(model, baseCost, engine);
		this.maxLoad=maxLoad;
	}
	
	@Override
	public double calculateDeliveryCost() {
		return baseCost+300;
		
	}
	
	public double calculateDeliveryCost(double distance, double fuelPrice) {
		return baseCost+ 300+ distance*fuelPrice;
		
	}
	
	@Override 
	public String getVehicleInfo() {
		return super.getVehicleInfo() + "\n"
				+ "Max load: "+ maxLoad+ "kg";
	}
	
	@Override 
	public String toString() {
		return "Truck{model=" + model+ ", baseCost=" + baseCost + ", engine="+ engine+  ", maxLoad=" + maxLoad+ "}";
	}
	

}
