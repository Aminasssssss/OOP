package kbtu.oop.lab2.task2;

public class Pawn extends Piece{
boolean isWhite;
    
    public Pawn(Position pos, boolean isWhite) {
        super(pos);
        this.isWhite = isWhite;
    }
    
    @Override
    public boolean isLegalMove(Position b) {
        int dx = b.x - a.x;
        int dy = Math.abs(b.y - a.y);
        
        if (isWhite) {
            if (dy == 0 && dx == 1) {
                return true;
            }
            if (dy == 1 && dx == 1) {
                return true;
            }
        } 
        else {
            if (dy == 0 && dx == -1) {
                return true;
            }
            if (dy == 1 && dx == -1) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        if (isWhite) {
            return "White pawn is on " + a;
        } 
        else {
            return "Black pawn is on " + a;
        }
    }

}
