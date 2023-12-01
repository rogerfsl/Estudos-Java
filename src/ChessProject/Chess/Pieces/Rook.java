package ChessProject.Chess.Pieces;

import ChessProject.Bordgame.Board;
import ChessProject.Chess.ChessPiece;
import ChessProject.Chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "R";
	}
	
	

	
}
