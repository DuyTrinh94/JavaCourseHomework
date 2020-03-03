package secondperiod;

import java.util.Scanner;

public class HomeWork3 {
	public static long FiboNum(int n) {
		long a = 1, b = 1, c = 1;
		for(int i = 1; i<=n; i++) {
			a = b;
			b = c;
			c = a+b;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, h;
		do {
			System.out.println("Nhap vao so luong virus Covid 19: ");
			n = scan.nextInt();
		}while(n<=0);
		
		do {
			System.out.println("Nhap vao so gio u benh: ");
			h = scan.nextInt();
		}while(h<=0);
		
		scan.close();
		
		System.out.println("Sum Covid19 = " + n*FiboNum(h));

	}
}
