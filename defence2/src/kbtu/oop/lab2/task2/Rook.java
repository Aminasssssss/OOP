package kbtu.oop.lab2.task2;

public class Rook extends Piece{
	
	public Rook(Position position) {
        super(position);
    }
	
	@Override
    public boolean isLegalMove(Position b) {
        if (a.x == b.x || a.y == b.y) {
            return true;
        }
        return false;
    }
	
	@Override 
	public String toString() {
		return "Rook is on "+ a;
	}
}
