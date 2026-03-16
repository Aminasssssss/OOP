package kbtu.oop.lab2.task1.part3;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
    	
    	HashSet<Car> cars = new HashSet<>();
    	
    	Car car1 = new Car("Toyota", 2020, "Camry");
        Car car2 = new Car("Toyota", 2020, "Camry"); 
        Car car3 = new Car("Honda", 2021, "Civic");
        Car car4 = new Car("Toyota", 2020, "Corolla");
        
        cars.add(car1);
        cars.add(car2); //!!!
        cars.add(car3);
        cars.add(car4);
        
        System.out.println("Count: " + cars.size()); 
        
        for (Car c : cars) {
            System.out.println(c);
        }
    }

}
