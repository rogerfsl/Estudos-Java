package ChessProject;

import java.util.Scanner;

import ChessProject.Bordgame.Board;
import ChessProject.Bordgame.Position;
import ChessProject.Chess.ChessMatch;
import ChessProject.Chess.ChessPiece;
import ChessProject.Chess.ChessPosition;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(scan);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(scan);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
		}
		
	}

}
