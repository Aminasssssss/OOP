package kbtu.oop.lab2.task1.part3;

import java.util.Objects;

public class Vehicle {
	private String brand;
	private int year;
	
	public Vehicle(String brand, int year) {
		this.brand=brand;
		this.year=year;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getYear() {
		return year;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	@Override
	public String toString() {
		return "Vehicle => brand: "+ brand+ ", year: "+ year;
	}
	
	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if(object==null || getClass()!=object.getClass()) {
			return false;
		}
		
		Vehicle vehicle = (Vehicle) object;
	
		return year==vehicle.year && Objects.equals(brand, vehicle.brand);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, year);
	}
	

}
