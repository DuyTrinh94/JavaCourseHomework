import java.util.Scanner;

public class HomeWork7 {
	public static void drawBlank(int n) {
		//Print line letters
		System.out.print("  ");
		for(int i=1; i<=n; i++) {
			System.out.print("    " + (char)(i+64) + "   ");
		}
		System.out.print("\n");
				
		//Print top edge
		System.out.print("  ");
		for(int i=1; i<=n; i++) {
			System.out.print(" _______");
		}
		System.out.print("\n");
				
		//Print rows
		for(int i=1; i<=n; i++) {
					
			//Print line 1 of row
			System.out.print("  ");
			for(int k=1; k<=n; k++) {
				System.out.print("|       ");
			}
			System.out.println("|");
					
			//Print line 2 of row (include index)
			System.out.print(i + " ");
			for(int k=1; k<=n; k++) {
				System.out.print("|       ");
			}
			System.out.println("|");
					
			//Print line 3 of row (include bottom edge)
			System.out.print("  ");
			for(int k=1; k<=n; k++) {
				System.out.print("|_______");
			}
			System.out.println("|");
		}
	}
	
	public static void drawWithChess(int n, char chess, int indexNum, char indexLetter) {
		//Print line letters
		System.out.print("  ");
		for(int i=1; i<=n; i++) {
			System.out.print("    " + (char)(i+64) + "   ");
		}
		System.out.print("\n");
				
		//Print top edge
		System.out.print("  ");
		for(int i=1; i<=n; i++) {
			System.out.print(" _______");
		}
		System.out.print("\n");
				
		//Print rows
		for(int i=1; i<=n; i++) {
			if(i==indexNum) {		
				//Print line 1 of row
				System.out.print("  ");
				for(int k=1; k<=n; k++) {
					System.out.print("|       ");
				}
				System.out.println("|");
						
				//Print line 2 of row (include index)
				System.out.print(i + " ");
				for(int k=1; k<=n; k++) {
					if(k == (int)(indexLetter) - 64) {
						System.out.print("|   " + chess + "   ");
					}else {
						System.out.print("|       ");
					}
				}
				System.out.println("|");
						
				//Print line 3 of row (include bottom edge)
				System.out.print("  ");
				for(int k=1; k<=n; k++) {
					System.out.print("|_______");
				}
				System.out.println("|");
			}else {
				//Print line 1 of row
				System.out.print("  ");
				for(int k=1; k<=n; k++) {
					System.out.print("|       ");
				}
				System.out.println("|");
						
				//Print line 2 of row (include index)
				System.out.print(i + " ");
				for(int k=1; k<=n; k++) {
					System.out.print("|       ");
				}
				System.out.println("|");
						
				//Print line 3 of row (include bottom edge)
				System.out.print("  ");
				for(int k=1; k<=n; k++) {
					System.out.print("|_______");
				}
				System.out.println("|");
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap n = ");
			n = scan.nextInt();
		}while(n<=0);
		scan.close();
	drawWithChess(n, 'X', 1, 'A');	
		
	}

}
