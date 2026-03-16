package kbtu.oop.practice4.problem3.service;

import kbtu.oop.practice4.problem3.model.Game;

public class App {
	public void getStatistics(Game g) {
		System.out.println("Statistics for: " + g.getClass().getSimpleName());
		g.a();
		g.b();
		g.c();
	}

}
