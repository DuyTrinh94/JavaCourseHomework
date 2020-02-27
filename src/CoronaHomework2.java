import java.util.Scanner;

public class CoronaHomework2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, k, a=1, b=1, c=1;
		String Fibo = "1";
		boolean hasK = false;
		
		do {
			System.out.println("Nhap vao so n>0: ");
			n = scan.nextInt();
		}while(n<=0);
		
		do {
			System.out.println("Nhap vao so k>0: ");
			k = scan.nextInt();
		}while(k<=0);
		
		scan.close();
		
		while(c<=n) {
			if(k==c) {
				hasK = true;
			}
			Fibo = Fibo + " " + c;
			a=b;
			b=c;
			c=a+b;
		}
		
		System.out.println("Fibonaci: " + Fibo);
		if(hasK) {
			System.out.println("k = " + k + " thuoc day fibo tren");
		}else {
			System.out.println("k = " + k + " khong thuoc day fibo tren");
		}
		
	}

}
