public class Board {
	/**
	 * @author Marcus Edwards
	 */
	
	/**
	 * Sets Size of board
	 */
	public int size;
	
	/**
	 * creates the board
	 */
	public char[][] board;
	
	/**
	 * creates a hidden board;
	 */
	public char[][] hiddenb;
	
	/**
	 * Board Constructor
	 * @param size
	 * @param board
	 */
	public Board(int size) {
		this.size = size;
	}
	
	/**
	 * creates the board of the correct size and then sets it equal to board
	 * @param size
	 * @return
	 */
	
	public char[][] createBoard(int size) {
		board= new char[size][size];
		hiddenb = new char[size][size];
    	for(int i = 0; i < board.length; i++){
    		for(int j = 0; j < board.length; j++){
    			board[i][j] = '*';
    			hiddenb[i][j] = board[i][j];
    		}
    	}
    	return board;
	}
	/**
	 * Prints board
	 * @param board
	 */
	public void printBoard() {
		for(int i = 0; i < board.length; i++){
    		for(int j = 0; j < board.length; j++){
    			System.out.print(board[i][j]);
    		}
    		System.out.println("");
		}
	}
	public void printBoard(int size) {
		for(int i = 0; i < board.length; i++){
    		for(int j = 0; j < board.length; j++){
    			System.out.print(board[i][j]);
    		}
    		System.out.println("");
		}
	}
	/**
	 * prints Hidden Board
	 * @param hiddenb
	 */
	public void printHidden() {
		for(int i = 0; i < hiddenb.length; i++){
    		for(int j = 0; j < hiddenb.length; j++){
    			System.out.print(hiddenb[i][j]);
    		}
    		System.out.println("");
		}
	}
	
	/**
	 * Allows editing of Board
	 * @param x
	 * @param y
	 * @param z
	 */
	public void inputBoard(int x, int y, char z) {
		board[x][y] = z;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public char[][] getBoard() {
		return board;
	}
	
	/**
	 * Allows editing of Hiddenboard
	 * @param x
	 * @param y
	 * @param z
	 */
	public void inputHidden(int x, int y, char z) {
		hiddenb[x][y] = z;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}
	public void clear() {
		
		System.out.print("\033[H\033[2J");
		
		System.out.flush();
	}
}
