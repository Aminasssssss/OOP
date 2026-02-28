package pr3.delivery.model;

public class Engine {
	private String type;
	private double horsepower;
	
	public Engine(String type, double horsepower) {
		this.type=type;
		this.horsepower= horsepower;
		
		
	}
	
	public String getType() {
		return type;
		
	}
	public double getHorsepower() {
		return horsepower;
	}
	
	public void getEngineInfo() {
		System.out.println("Engine type: "+ type);
		System.out.println("Horsepower: "+ horsepower);
	}
	
	@Override 
	public String toString() {
		return "Engine{type="+ type+ " ,horsepower="+ horsepower+ "}";
		
	}
	

}
