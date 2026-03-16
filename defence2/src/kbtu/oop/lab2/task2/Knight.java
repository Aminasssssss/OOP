package kbtu.oop.lab2.task2;

public class Knight extends Piece{
	
	public Knight(Position pos) {
        super(pos);
    }
    
    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.x - b.x);
        int dy = Math.abs(a.y - b.y);
        
        if (dx == 2 && dy == 1) {
            return true;
        }
        if (dx == 1 && dy == 2) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Knight is on " + a;
    }

}
