package kbtu.oop.practice4.problem2.main;

import kbtu.oop.practice4.problem2.model.Cat;
import kbtu.oop.practice4.problem2.model.Person;
import kbtu.oop.practice4.problem2.model.Student;
import kbtu.oop.practice4.problem2.service.Restaurant;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		
		Cat cat = new Cat();
		Student student= new Student("Aibek");
		
		System.out.println("Serving pizza to Cat");
		restaurant.servePizza(cat);
		
		System.out.println("Serving pizza to Student");
		restaurant.servePizza(student);
		
		System.out.println("Is student a Person? " + (student instanceof Person));

	}

}
