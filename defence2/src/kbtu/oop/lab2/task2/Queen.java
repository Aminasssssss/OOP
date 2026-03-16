package kbtu.oop.lab2.task2;

public class Queen extends Piece{
	
	public Queen(Position position) {
		super(position);
	}
	
	@Override
    public boolean isLegalMove(Position b) {
        Bishop bishop = new Bishop(b);
        Rook rook= new Rook(b);
        
        return bishop.isLegalMove(b) || rook.isLegalMove(b);
        
    }
	
	@Override
    public String toString() {
        return "Queen is on " + a;
    }
    
	

}
