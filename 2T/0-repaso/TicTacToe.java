import java.util.Scanner;

public class TicTacToe {

	static final int SIZE = 9;

	public static char[] initBoard(int n){
		char[] board = new char[n];
		for (int i=0; i<board.length; i+=1 ) {
			board[i] = ' ';
		}
		return board;
	}

	public static void printBoard(char[] board){
		int limit = (int) Math.floor(Math.sqrt(board.length));
		System.out.print("|-----|");
		for (int i=0; i<board.length; i+=1) {
			if(i%limit == 0){
				System.out.print("\n|");
			}
			System.out.print(board[i]+ "|");
		}
		System.out.println("\n|-----|");
	}

	public static int requestPosition(){
		Scanner console = new Scanner(System.in);
		System.out.print("Select the desired cell: ");
		return Integer.parseInt(console.nextLine());
	}

	public static void play(char[] board, char player){
		int position = requestPosition();
		board[position] = player;
	}

	public static boolean checkWinner(char[] board){
		return true;
	}

	public static void main(String[] args) {
		boolean end = false;
		char[] board = initBoard(SIZE);
		char[] players = {'X', 'O'};

		int player = 0;

		printBoard(board);
		while(!end){
			play(board, players[player]);
			printBoard(board);
			if(checkWinner(board)){
				end = true;
			}
			player = 1 - player;
		}

	}
}