package kbtu.oop.lab2.task1.part3;

import java.util.Objects;

public class Car extends Vehicle {
    private String model;
    
    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    @Override 
    public String toString() {
        return super.toString() + ", model: " + model;
    }
    
    @Override 
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Car)) {
            return false;
        }
        Car car = (Car) object;
        return super.equals(object) && Objects.equals(model, car.model);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }
}
