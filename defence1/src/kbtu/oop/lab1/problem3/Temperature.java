package kbtu.oop.lab1.problem3;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature() {
		this.value=0;
		this.scale='C';
	}
	
	public Temperature(double value) {
		this.value=value;
		this.scale='C';
		
	}
	public Temperature(char scale) {
		this.value=0;
		
		if(scale=='C' || scale=='F') {
			this.scale=scale;
			
		}
		else {
			this.scale='C';
		}
	}
	
	public Temperature(double value, char scale) {
		this.value=value;
		
		if(scale=='C' || scale=='F') {
			this.scale=scale;
		}
		else {
			this.scale='C';
		}
	}
	
	public double getCelsius() {
		if(scale=='C') {
			return value;
		}
		else {
			return 5*(value-32)/9;
		}
	}
	
	public double getFahrenheit() {
		if(scale=='F') {
			return value;
		}
		else {
			return (9*value/5)+32;
			
		}
	}
	
	
	
	public char getScale() {
		return scale;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value=value;
	}
	public void setScale(char scale) {
		if(scale=='C' || scale=='F') {
			this.scale=scale;
		}
	}
	public void setBoth(double value, char scale) {
		this.value=value;
		if(scale=='C' || scale=='F') {
			this.scale=scale;
		}
	}
	
	
	public String toString() {
		return value + "°" + scale + "(Celsius: "+ getCelsius() + "C, "+ "Fahrenheit: "+ getFahrenheit() + "°F)"; 
	}

}
