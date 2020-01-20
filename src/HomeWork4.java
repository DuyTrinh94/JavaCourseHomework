import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numAfterConvert = "";
		int b, n;
		do {
			System.out.println("Nhap so tu nhien n = ");
			n = scan.nextInt();
		}while(n<0);
		do {
			System.out.println("Nhap he co so muon chuyen doi: ");
			b = scan.nextInt();
		}while(b<=1 || b>36);
		scan.close();
		while(n!=0) {
			if(n%b>9) {
				numAfterConvert += (char)(n%b + 55);
			}else {
				numAfterConvert += n%b;
			}
			n/=b;
		}

		System.out.println(HomeWork5.reverse(numAfterConvert));
	}

}
