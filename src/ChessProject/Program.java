package ChessProject;

import ChessProject.Bordgame.Board;
import ChessProject.Bordgame.Position;
import ChessProject.Chess.ChessMatch;

public class Program {
	
	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
