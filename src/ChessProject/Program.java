package ChessProject;

import java.util.InputMismatchException;
import java.util.Scanner;

import ChessProject.Bordgame.Board;
import ChessProject.Bordgame.Position;
import ChessProject.Chess.ChessException;
import ChessProject.Chess.ChessMatch;
import ChessProject.Chess.ChessPiece;
import ChessProject.Chess.ChessPosition;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			try { 
				UI.clearScreen();
				UI.printMatch(chessMatch);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(scan);
				
				boolean [][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(scan);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				
			}catch(ChessException e){
				
				System.out.println(e.getMessage());
				scan.nextLine();
			}catch (InputMismatchException e) {
				
				System.out.println(e.getMessage());
				scan.nextLine();
			}
			
			
		}
		
	}

}
