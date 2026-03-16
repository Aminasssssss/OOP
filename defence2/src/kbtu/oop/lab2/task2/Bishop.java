package kbtu.oop.lab2.task2;

public class Bishop extends Piece{
	
	public Bishop(Position position) {
		super(position);
	}
	
	
	@Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        
        if (dx == dy) {
            return true;
        }
        return false;
    }
	
	 @Override
	    public String toString() {
	        return "Bishop is on " + a;
	    }

}
