package ChessProject.Chess;

import ChessProject.Bordgame.Board;
import ChessProject.Bordgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	

}