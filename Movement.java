public class Movement extends Board {

	public void movement(char x, char y, char z, char[][] board, char[][] hiddenb, int a, int b, char c) {
		board[a][b] = c;
		hiddenb[a][b] = c;
		if(hiddenb[a][b-1] == y || hiddenb[a][b+1] == y) {
			
		}
		else if(hiddenb[a+1][b] == y || hiddenb[a+1][b] == y) {
			
		}
	}
}
