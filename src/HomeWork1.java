import java.util.Scanner;

public class HomeWork1 {
	private static int a,b;
	//Tinh UCLN
	public static int UCLN(int a, int b) {
		while(a!=b) {
			if(a>b) {
				a-=b;
			}else {
				b-=a;
			}
		}
		return a;
	}
	//Tinh BCNN
	public static int BCNN(int a, int b) {
		return (a*b)/UCLN(a,b);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Nhap vao a = ");
			a = scan.nextInt();
			System.out.println("Nhap vao b = ");
			b = scan.nextInt();
		}while(a<1 || b<1);
		scan.close();
		
		System.out.println("BCNN cua a va b = " + BCNN(a,b));
		
	}

}
