import java.util.Scanner;

public class HomeWork7 {
	public static final char SPACE = ' ';
	private static char chessInBoard[][] = new char[3][3];
	
	public static void blankBoard() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				chessInBoard[i][j] = SPACE;
			}
		}
		boardWithChess();
	}
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
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("**********************************");
		System.out.print  ("*          GAME CARO 3x3         *\n");
		System.out.println("**********************************\n");
		
		System.out.print("Nhap ten player 1: ");
		String player1Name = scan.nextLine();
		System.out.print("Nhap ten player 2: ");
		String player2Name = scan.nextLine();
		
		System.out.println("[1] " + player1Name + ": O");
		System.out.println("[2] " + player2Name + ": X");
		
		boolean isPlayer1 = true;
		int temp;
		do {
			System.out.println("Chon nguoi di truoc [Nhan 1 hoac 2]: ");
			temp = scan.nextInt();
			if(temp == 1) {
				isPlayer1 = true;
			}else if(temp == 2){
				isPlayer1 = false;
			}
		}while(temp!=1 && temp!=2);
		
		
		System.out.println("************GAME STARTED**********");
		
		blankBoard();
		System.out.println("\n");

		char coorColumn = ' ';
		char coorRow = ' ';
		String coordinate;
		do {
			if(isPlayer1) {
				System.out.print("[Luot cua " + player1Name + " ] Chon vi tri: ");
			}else {
				System.out.print("[Luot cua " + player2Name + " ] Chon vi tri: ");
			}
			coordinate = scan.nextLine();
			if(coordinate.length() == 2) {
				coorColumn = coordinate.split("")[0].toCharArray()[0];
				coorRow = coordinate.split("")[1].toCharArray()[0];
			}			
		}while(((int)coorColumn-64 < 1 || (int)coorColumn-64 > 3) ||
				((int)coorRow-48 < 1 || (int)coorRow-48 > 3) ||
				coordinate.length()!=2 ||
				chessInBoard[coorRow-49][coorColumn-65]!=SPACE);
		
		chessInBoard[coorRow-49][coorColumn-65] = 'X';
		boardWithChess();

	}

}
