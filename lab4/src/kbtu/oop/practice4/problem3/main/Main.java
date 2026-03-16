package kbtu.oop.practice4.problem3.main;

import kbtu.oop.practice4.problem3.model.*;
import kbtu.oop.practice4.problem3.service.App;

public class Main {

	public static void main(String[] args) {
		App app= new App();
		
		app.getStatistics(new LogicGame());
		app.getStatistics(new MemoryGame());
		
		iPhone myPhone= new iPhone();
		
		 System.out.println("Is iPhone Sellable? "  + (myPhone instanceof Sellable));
		 System.out.println("Is iPhone Pluggable? " + (myPhone instanceof Pluggable));
		 myPhone.sell();
	     myPhone.plug();
		 
		
		
	}

}
