package ChessProject.Bordgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;

	public Piece(Board board) {
		super();
		this.board = board;
	}// Construtor somente com o tabuleiro por que a peça vai ter valor inicial nulo.

	protected Board getBoard() { // para restringir o acesso somente para o pacote tableiro e pelas subclasses de peças
		return board;
	}
	
	 public abstract boolean [][] possibleMoves();
	
	 public boolean possibleMove(Position position) {
		 return possibleMoves()[position.getRow()][position.getColumn()]; //
	 }
	 
	 public boolean isThereAnyPossibleMove() {
		 boolean [][] mat = possibleMoves();
		 for(int i = 0; i < mat.length; i++) {
			 for (int j = 0; j < mat.length; j++) {
				 if(mat [i][j]) {
					 return true;
				 }
			 }
		 }
		 return false;
	 }

}
