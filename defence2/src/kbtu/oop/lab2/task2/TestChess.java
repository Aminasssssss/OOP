package kbtu.oop.lab2.task2;

import java.util.Scanner;

public class TestChess {
    
    public static void main(String[] args) {
        Piece[][] board = new Piece[8][8];
        
        boolean isWhiteTurn = true;
        
        Scanner scanner = new Scanner(System.in);
        
        board[0][0] = new Rook(new Position(1, 1));
        board[0][1] = new Knight(new Position(1, 2));
        board[0][2] = new Bishop(new Position(1, 3));
        board[0][3] = new Queen(new Position(1, 4));
        board[0][4] = new King(new Position(1, 5));
        board[0][5] = new Bishop(new Position(1, 6));
        board[0][6] = new Knight(new Position(1, 7));
        board[0][7] = new Rook(new Position(1, 8));
        
        board[1][0] = new Pawn(new Position(2, 1), true);
        board[1][1] = new Pawn(new Position(2, 2), true);
        board[1][2] = new Pawn(new Position(2, 3), true);
        board[1][3] = new Pawn(new Position(2, 4), true);
        board[1][4] = new Pawn(new Position(2, 5), true);
        board[1][5] = new Pawn(new Position(2, 6), true);
        board[1][6] = new Pawn(new Position(2, 7), true);
        board[1][7] = new Pawn(new Position(2, 8), true);
        
        board[7][0] = new Rook(new Position(8, 1));
        board[7][1] = new Knight(new Position(8, 2));
        board[7][2] = new Bishop(new Position(8, 3));
        board[7][3] = new Queen(new Position(8, 4));
        board[7][4] = new King(new Position(8, 5));
        board[7][5] = new Bishop(new Position(8, 6));
        board[7][6] = new Knight(new Position(8, 7));
        board[7][7] = new Rook(new Position(8, 8));
        
        board[6][0] = new Pawn(new Position(7, 1), false);
        board[6][1] = new Pawn(new Position(7, 2), false);
        board[6][2] = new Pawn(new Position(7, 3), false);
        board[6][3] = new Pawn(new Position(7, 4), false);
        board[6][4] = new Pawn(new Position(7, 5), false);
        board[6][5] = new Pawn(new Position(7, 6), false);
        board[6][6] = new Pawn(new Position(7, 7), false);
        board[6][7] = new Pawn(new Position(7, 8), false);
        
        System.out.println("Enter moves like: a2 a4");
        System.out.println("Type 'exit' to quit");
        
        while (true) {
            System.out.println("\n  a  b  c  d  e  f  g  h");
            
            for (int i = 7; i >= 0; i--) {
                System.out.print((i+1) + " ");
                for (int j = 0; j < 8; j++) {
                    if (board[i][j] == null) {
                        System.out.print(".  ");
                    } else {
                        Piece p = board[i][j];
                        if (p instanceof King) 
                        	System.out.print("K  ");
                        else if (p instanceof Queen) 
                        	System.out.print("Q  ");
                        else if (p instanceof Rook) 
                        	System.out.print("R  ");
                        else if (p instanceof Bishop) 
                        	System.out.print("B  ");
                        else if (p instanceof Knight) 
                        	System.out.print("N  ");
                        else if (p instanceof Pawn) 
                        	System.out.print("P  ");
                    }
                }
                System.out.println();
            }
            
            if (isWhiteTurn) {
                System.out.println("White's turn");
            } else {
                System.out.println("Black's turn");
            }
            
            System.out.print("Your move: ");
            String input = scanner.nextLine();
            
            if (input.equals("exit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Error: need two positions");
                continue;
            }
            
            String fromStr = parts[0];
            String toStr = parts[1];
            
            char fromLetter = fromStr.charAt(0);
            char fromNumber = fromStr.charAt(1);
            
            int fromY = 0;
            if (fromLetter == 'a') 
            	fromY = 1;
            else if (fromLetter == 'b') 
            	fromY = 2;
            else if (fromLetter == 'c') 
            	fromY = 3;
            else if (fromLetter == 'd') 
            	fromY = 4;
            else if (fromLetter == 'e') 
            	fromY = 5;
            else if (fromLetter == 'f') 
            	fromY = 6;
            else if (fromLetter == 'g') 
            	fromY = 7;
            else if (fromLetter == 'h') 
            	fromY = 8;
            
            int fromX = fromNumber - '0';
            
            char toLetter = toStr.charAt(0);
            char toNumber = toStr.charAt(1);
            
            int toY = 0;
            if (toLetter == 'a') 
            	toY = 1;
            else if (toLetter == 'b') 
            	toY = 2;
            else if (toLetter == 'c') 
            	toY = 3;
            else if (toLetter == 'd') 
            	toY = 4;
            else if (toLetter == 'e') 
            	toY = 5;
            else if (toLetter == 'f') 
            	toY = 6;
            else if (toLetter == 'g') 
            	toY = 7;
            else if (toLetter == 'h') 
            	toY = 8;
            
            int toX = toNumber - '0';
            
            if (fromX < 1 || fromX > 8 || fromY < 1 || fromY > 8 ||
                toX < 1 || toX > 8 || toY < 1 || toY > 8) {
                System.out.println("Invalid coordinates");
                continue;
            }
            
            Piece piece = board[fromX-1][fromY-1];
            
            if (piece == null) {
                System.out.println("No piece there");
                continue;
            }
            
            Position toPos = new Position(toX, toY);
            
            if (piece.isLegalMove(toPos)) {
                board[toX-1][toY-1] = piece;
                board[fromX-1][fromY-1] = null;
                piece.a = toPos;
                
                isWhiteTurn = !isWhiteTurn;
                
                System.out.println("Move accepted");
            } else {
                System.out.println("Illegal move");
            }
        }
        
        System.out.println("Game over");
        scanner.close();
    }
}
