package ChessProject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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
		List<ChessPiece> captured = new ArrayList<ChessPiece>();
		
		while(!chessMatch.getCheckMate()) {
			try { 
				UI.clearScreen();
				UI.printMatch(chessMatch, captured);
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
				
				if(capturedPiece != null) {
					captured.add(capturedPiece);
				}
				if(chessMatch.getPromoted() != null) {
					System.out.print("Enter piece for promotion (B/N/R/Q): ");
					String type = scan.next().toUpperCase();
					while(!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")) {
						System.out.print("Invalid value! Enter piece for promotion (B/N/R/Q): ");
						type = scan.next().toUpperCase();
					}
					chessMatch.replacePromotedPiece(type);
				}
				
			}catch(ChessException e){
				
				System.out.println(e.getMessage());
				scan.nextLine();
			}catch (InputMismatchException e) {
				
				System.out.println(e.getMessage());
				scan.nextLine();
			}
			
			
		}
		UI.clearScreen();
		UI.printMatch(chessMatch, captured);
		
	}

}
