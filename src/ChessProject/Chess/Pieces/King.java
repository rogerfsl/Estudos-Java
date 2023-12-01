package ChessProject.Chess.Pieces;

import ChessProject.Bordgame.Board;
import ChessProject.Chess.ChessPiece;
import ChessProject.Chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "K";
	}
	
	
}
