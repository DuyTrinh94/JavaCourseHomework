import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap n = ");
			n = scan.nextInt();
		}while(n<=0);
		scan.close();
//		System.out.println(" ____ ____");
//		System.out.println("|    |    |");
//		System.out.println("|____|____|");
//		System.out.println("|    |    |");
//		System.out.println("|____|____|");
		for(int i=1; i<=n; i++) {
			System.out.print(" ____");
		}
		System.out.print("\n");
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n; k++) {
				System.out.print("|    ");
			}
			System.out.println("|");
			
			for(int k=1; k<=n; k++) {
				System.out.print("|____");
			}
			System.out.println("|");
		}

	}

}
