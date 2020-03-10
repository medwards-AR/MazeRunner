import java.util.*;

/**
 * 
 */

/**
 * @author me023229
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean running = true;
		int size = 20;
		char runner = '#';
		char en = 'I';
		char ex = 'O';
		char pathing = '.';
		char wall1 = '|';
		char wall2 = '_';
		Board m = new Board(size);
		m.createBoard(size);
		System.out.println(" ");
		m.inputBoard(0, 9, runner);
		m.inputHidden(0, 9, runner);
		m.printBoard();
		m.inputHidden(0, 8, wall1);
		m.inputHidden(0, 10, wall1);
		m.inputHidden(1, 8, wall1);
		m.inputHidden(1, 10, wall1);
		m.inputHidden(2, 8, wall1);
		m.inputHidden(2, 10, wall1);
		
		m.inputHidden(3, 8, wall1);
		m.inputHidden(3, 10, wall1);
		m.inputHidden(3, 7, wall2);
		m.inputHidden(3, 11, wall2);
		m.inputHidden(3, 6, wall2);
		m.inputHidden(3, 12, wall2);
		m.inputHidden(3, 5, wall2);
		m.inputHidden(3, 13, wall2);
		m.inputHidden(3, 4, wall2);
		m.inputHidden(3, 14, wall2);
		m.inputHidden(3, 3, wall1);
		m.inputHidden(3, 15, wall1);
		m.inputHidden(3, 1, wall1);
		m.inputHidden(3, 17, wall1);
		m.inputHidden(2, 1, wall1);
		m.inputHidden(2, 17, wall1);
		m.inputHidden(4, 1, wall1);
		m.inputHidden(4, 17, wall1);
		m.inputHidden(5, 1, wall1);
		m.inputHidden(5, 17, wall1);
		m.inputHidden(1, 1, wall1);
		m.inputHidden(1, 17, wall1);
		m.inputHidden(0, 2, wall2);
		m.inputHidden(0, 16, wall2);
		m.inputHidden(1, 3, wall1);
		m.inputHidden(1, 15, wall1);
		m.inputHidden(2, 3, wall1);
		m.inputHidden(2, 15, wall1);
		
		m.inputHidden(5, 9, wall2);
		m.inputHidden(5, 8, wall2);
		m.inputHidden(5, 10, wall2);
		m.inputHidden(5, 7, wall2);
		m.inputHidden(5, 11, wall2);
		m.inputHidden(5, 6, wall2);
		m.inputHidden(5, 12, wall2);
		m.inputHidden(5, 5, wall2);
		m.inputHidden(5, 13, wall2);
		m.inputHidden(5, 4, wall2);
		m.inputHidden(5, 14, wall2);
		m.inputHidden(5, 3, wall1);
		m.inputHidden(5, 15, wall1);
		m.inputHidden(6, 3, wall1);
		m.inputHidden(6, 15, wall1);
		m.inputHidden(7, 3, wall1);
		m.inputHidden(7, 15, wall1);
		m.inputHidden(8, 3, wall1);
		m.inputHidden(8, 15, wall1);
		m.inputHidden(6, 1, wall1);
		m.inputHidden(6, 17, wall1);
		m.inputHidden(7, 1, wall1);
		m.inputHidden(7, 17, wall1);
		m.inputHidden(8, 1, wall1);
		m.inputHidden(8, 17, wall1);
		m.inputHidden(9, 3, wall1);
		m.inputHidden(9, 15, wall1);
		m.inputHidden(10, 3, wall1);
		m.inputHidden(10, 15, wall1);
		m.inputHidden(9, 1, wall1);
		m.inputHidden(9, 17, wall1);
		m.inputHidden(10, 1, wall1);
		m.inputHidden(10, 17, wall1);
		m.inputHidden(12, 2, wall2);
		m.inputHidden(12, 16, wall2);
		m.inputHidden(11, 1, wall1);
		m.inputHidden(11, 17, wall1);
		m.inputHidden(12, 1, wall1);
		m.inputHidden(12, 17, wall1);
		m.inputHidden(10, 1, wall1);
		m.inputHidden(10, 17, wall1);
		m.inputHidden(10, 3, wall1);
		m.inputHidden(10, 15, wall1);
		m.inputHidden(12, 3, wall2);
		m.inputHidden(12, 15, wall2);
		m.inputHidden(12, 4, wall2);
		m.inputHidden(12, 14, wall2);
		m.inputHidden(10, 4, wall2);
		m.inputHidden(10, 14, wall2);
		m.inputHidden(10, 5, wall2);
		m.inputHidden(10, 13, wall2);
		m.inputHidden(12, 5, wall2);
		m.inputHidden(12, 13, wall2);
		m.inputHidden(10, 6, wall2);
		m.inputHidden(10, 12, wall2);
		m.inputHidden(12, 6, wall2);
		m.inputHidden(12, 12, wall2);
		m.inputHidden(10, 7, wall2);
		m.inputHidden(10, 11, wall2);
		m.inputHidden(12, 7, wall2);
		m.inputHidden(12, 11, wall2);
		m.inputHidden(10, 8, wall1);
		m.inputHidden(10, 10, wall1);
		m.inputHidden(9, 8, wall1);
		m.inputHidden(9, 10, wall1);
		m.inputHidden(8, 8, wall1);
		m.inputHidden(8, 10, wall1);
		m.inputHidden(7, 9, wall2);
		m.inputHidden(12, 8, wall1);
		m.inputHidden(12, 10, wall1);
		m.inputHidden(13, 8, wall1);
		m.inputHidden(13, 10, wall1);
		m.inputHidden(14, 8, wall1);
    	m.inputHidden(14, 10, wall1);
		m.inputHidden(15, 8, wall1);
		m.inputHidden(15, 10, wall1);
		m.inputHidden(15, 7, wall2);
		m.inputHidden(15, 11, wall2);
		m.inputHidden(15, 6, wall2);
		m.inputHidden(15, 12, wall2);
		m.inputHidden(15, 5, wall2);
		m.inputHidden(15, 13, wall2);
		m.inputHidden(15, 4, wall2);
		m.inputHidden(15, 14, wall2);
		m.inputHidden(16, 3, wall1);
		m.inputHidden(16, 15, wall1);
		m.inputHidden(17, 7, wall2);
		m.inputHidden(17, 11, wall2);
		m.inputHidden(17, 6, wall2);
		m.inputHidden(17, 12, wall2);
		m.inputHidden(17, 5, wall2);
		m.inputHidden(17, 13, wall2);
		m.inputHidden(17, 4, wall2);
		m.inputHidden(17, 14, wall2);
		m.inputHidden(17, 8, wall1);
		m.inputHidden(17, 10, wall1);
		m.inputHidden(18, 8, wall1);
		m.inputHidden(18, 10, wall1);
		m.inputHidden(19, 8, wall1);
		m.inputHidden(19, 10, wall1);
		
		
		if(runner != m.board[0][9] && en != m.board[0][9]) {
			m.inputBoard(0, 9, en);
			m.inputHidden(0, 9, en);
			m.printBoard();
		}
		else if(runner != m.board[19][9] && ex != m.board[19][9]) {
			m.inputBoard(19, 9, ex);
			m.inputHidden(19, 9, ex);
			System.out.println(" ");
			m.printBoard();
			System.out.println(" ");
		}
		
		m.clear();
		System.out.println("");
		m.printHidden();
		
		while(running) {
			
		}

	}
}