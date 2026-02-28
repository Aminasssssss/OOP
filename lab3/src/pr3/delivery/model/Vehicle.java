package pr3.delivery.model;

public abstract class Vehicle {
	protected String model;
	protected double baseCost;
	protected Engine engine;
	
	
	public Vehicle(String model, double baseCost, Engine engine) {
		this.model=model;
		this.baseCost=baseCost;
		this.engine=engine;
		
	}
	
	public double calculateDeliveryCost() {
		return baseCost;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getVehicleInfo() {
		return "Model: "+ model + "\n"
				+ "Base cost: " + baseCost+ "\n"
				+ "Engine type: " +engine.getType() +"\n"
				+ "Horsepower: "+ engine.getHorsepower();
	}
	
	@Override 
	public String toString() {
		return "Vehicle{model="+ model+ ", baseCost= "+ baseCost + "}";
	}
}
