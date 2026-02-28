package pr3.animal.app;

import pr3.animal.model.Animal;
import pr3.animal.model.Dog;

import java.util.ArrayList;
import java.util.List;



public class MainApp {
	

	public static void main(String[] args) {
		Animal animal= new Dog("Buddy", 3, "Labrador");
		Dog dog1= new Dog("Max", 6, "German Shepherd");
		Dog dog2= new Dog("Bella", 2, "Poodle");
		
		
		List<Animal> animals= new ArrayList<>();
		animals.add(animal);
		animals.add(dog1);
		animals.add(dog2);
		
		
		for(Animal a: animals) {
			System.out.println("---");
			System.out.println(a);
			a.getInfo();
			a.makeSound();
			a.eat();
			a.eat("bone");
			
		}
	}

}
