package ChessProject.Bordgame;

public class Piece {
	
	protected Position position;
	
	private Board board;

	public Piece(Board board) {
		super();
		this.board = board;
	}// Construtor somente com o tabuleiro por que a peça vai ter valor inicial nulo.

	protected Board getBoard() { // para restringir o acesso somente para o pacote tableiro e pelas subclasses de peças
		return board;
	}
	
	

}
