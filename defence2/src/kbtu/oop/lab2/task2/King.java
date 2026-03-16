package kbtu.oop.lab2.task2;

public class King extends Piece {
	
	public King(Position position) {
		super(position);
	}
	
	@Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        
        if (dx <= 1 && dy <= 1) {
            return true;
        }
        return false;
    }
	@Override
    public String toString() {
        return "King is on " + a;
    }
	

}
