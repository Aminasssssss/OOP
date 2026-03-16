package kbtu.oop.lab2.task2;

public abstract class Piece {
	Position a;
	
	public Piece(Position position) {
		a=position;
		
	}
	
	public abstract  boolean isLegalMove(Position b);
	
	@Override 
	public String toString() {
		return "Fiqure is on "+ a;
	}

}
