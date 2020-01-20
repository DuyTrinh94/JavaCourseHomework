import java.util.Scanner;

public class HomeWork2 {
	
	public static void main(String[] args) {
		int n, sum =0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Nhap vao so tu nhien n = ");
			n = scan.nextInt();
		}while(n<0);
		scan.close();
		
		while(n!=0) {
			sum += (n%10);
			n/=10;
		}
		
		System.out.println("Tong cac chu so cua n = " + sum);
	}

}
