package kbtu.oop.practice4.problem2.service;

import kbtu.oop.practice4.problem2.model.CanHavePizza;
import kbtu.oop.practice4.problem2.model.Person;

public class Restaurant {
	public boolean servePizza(CanHavePizza eater) {
		eater.eatPizza();
		
		if(eater instanceof Person) {
			System.out.println("Processing payment...");
		}
		return true;
	}
	

}
