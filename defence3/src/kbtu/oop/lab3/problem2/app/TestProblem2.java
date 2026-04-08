package kbtu.oop.lab3.problem2.app;
import kbtu.oop.lab3.problem2.model.*;


public class TestProblem2 {

	public static void main(String[] args) {
		
		Bird bird = new Bird("Eagle");
        bird.move();
        bird.fly();
        
        Moveable m = bird;
        m.move();
        
        Flyable f = bird;
        f.move();
        f.fly();
        
        

	}

}
