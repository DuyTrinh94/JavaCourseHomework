import java.util.Scanner;

public class HomeWork7 {
	public static final char SPACE = ' ';
	private static char chessInBoard[][] = new char[3][3];
	private static char chessWin = SPACE;
	
	//Display blank board
	public static void blankBoard() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				chessInBoard[i][j] = SPACE;
			}
		}
		boardWithChess();
	}
	
	//Display board
	public static void printLineLetters() {
		System.out.print("  ");
		for(int i=1; i<=3; i++) {
			System.out.print("    " + (char)(i+64) + "   ");
		}
	}
	
	public static void printTopEdge() {
		System.out.print("  ");
		for(int i=1; i<=3; i++) {
			System.out.print(" _______");
		}
	}
	
	public static void boardWithChess() {
		//Print line letters
		printLineLetters();
		System.out.print("\n");
				
		//Print top edge
		printTopEdge();
		System.out.print("\n");
				
		//Print rows
		for(int i=1; i<=3; i++) {
			//Print line 1 of row
			System.out.print("  ");
			for(int k=1; k<=3; k++) {
				System.out.print("|       ");
			}
			System.out.println("|");
					
			//Print line 2 of row (include index)
			System.out.print(i + " ");
			for(int k=1; k<=3; k++) {
				if(chessInBoard[i-1][k-1]!='\u0000') {
					System.out.print("|   " + chessInBoard[i-1][k-1] + "   ");
				}else {
					System.out.print("|   " + SPACE + "   ");
				}
			}
			System.out.println("|");
					
			//Print line 3 of row (include bottom edge)
			System.out.print("  ");
			for(int k=1; k<=3; k++) {
				System.out.print("|_______");
			}
			System.out.println("|");
		}
	}
	
	//check win
	public static boolean isWin() {
		
		//check row
		for(int i=0; i<3; i++) {
			if(chessInBoard[i][0]==chessInBoard[i][1] && chessInBoard[i][0]==chessInBoard[i][2] && chessInBoard[i][0]!=SPACE) {
				chessWin = chessInBoard[i][0];
				break;
			}
		}
		
		//check column
		for(int i=0; i<3; i++) {
			if(chessInBoard[0][i]==chessInBoard[1][i] && chessInBoard[0][i]==chessInBoard[2][i] && chessInBoard[0][i]!=SPACE) {
				chessWin = chessInBoard[0][i];
				break;
			}
		}
		
		//check diagonals
		if(chessInBoard[0][0]==chessInBoard[1][1] && chessInBoard[0][0]==chessInBoard[2][2] && chessInBoard[0][0]!=SPACE) {
			chessWin = chessInBoard[0][0];
		}
		if(chessInBoard[0][2]==chessInBoard[1][1] && chessInBoard[0][2]==chessInBoard[2][0] && chessInBoard[0][2]!=SPACE) {
			chessWin = chessInBoard[0][2];
		}
		
//		if(chessWin=='X' || chessWin=='O') {
//			return true;
//		}else {
//			return false;
//		}
		return chessWin=='X' || chessWin=='O';
	}
	
	//check board full with chess
	public static boolean isFull() {
		int count=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(chessInBoard[i][j]!=SPACE) {
					count++;
				}
			}
		}
		if(count==9) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Display header
		System.out.println("**********************************");
		System.out.print  ("*          GAME CARO 3x3         *\n");
		System.out.println("**********************************\n");
		
		//Input player name
		System.out.print("Nhap ten player 1: ");
		String player1Name = scan.nextLine();
		System.out.print("Nhap ten player 2: ");
		String player2Name = scan.nextLine();
		
		//Display player name and chess
		System.out.println("[1] " + player1Name + ": O");
		System.out.println("[2] " + player2Name + ": X");
		
		//Select player first
		boolean isPlayer1 = true;
		int temp;
		do {
			System.out.print("Chon nguoi di truoc [Nhan 1 hoac 2]: ");
			temp = scan.nextInt();
			if(temp == 1) {
				isPlayer1 = true;
			}else{
				isPlayer1 = false;
			}
		}while(temp!=1 && temp!=2);
		
		//GAME STARTED
		System.out.println("************GAME STARTED**********");
		
		//display blank board
		blankBoard();
		System.out.println("\n");
		
		//Declare coordinate of chess
		char coorColumn = ' ';
		char coorRow = ' ';
		String coordinate;
		
		while(!isWin() && !isFull()) {
			boolean displayAgain = false;
			do {
				if(displayAgain) {
					System.out.println("Vi tri khong dung, hay nhap lai!\n");
				}
				if(isPlayer1) {
					System.out.print("[Luot cua " + player1Name + "] Chon vi tri: ");
				}else {
					System.out.print("[Luot cua " + player2Name + "] Chon vi tri: ");
				}
				coordinate = scan.next();
				if(coordinate.length() == 2) {
					coorColumn = coordinate.split("")[0].toCharArray()[0];
					coorRow = coordinate.split("")[1].toCharArray()[0];
				}
				displayAgain = true;
			}while(((int)coorColumn-64 < 1 || (int)coorColumn-64 > 3) || //validation for selecting location of chess
					((int)coorRow-48 < 1 || (int)coorRow-48 > 3) ||
					coordinate.length()!=2 ||
					chessInBoard[coorRow-49][coorColumn-65]!=SPACE);
			
			//Add chess into matrix
			if(isPlayer1) {
				chessInBoard[coorRow-49][coorColumn-65] = 'O';
				isPlayer1 = false;
			}else {
				chessInBoard[coorRow-49][coorColumn-65] = 'X';
				isPlayer1 = true;
			}
			
			//Display board with chess
			boardWithChess();
			System.out.print("\n");
		}
		
		if(isWin() && chessWin=='O') {
			System.out.println("********** " + player1Name + " win **********");
		}else if(isWin() && chessWin=='X') {
			System.out.println("********** " + player2Name + " win **********");
		}
		
		if(!isWin() && isFull()) {
			System.out.println("********** DRAWN **********" );
		}
		scan.close();
	}

}
