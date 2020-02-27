import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class CoronaHomework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		float sum = 0;
		do {
			System.out.println("Nhap vao so n>0: ");
			n = scan.nextInt();
		}while(n<=0);
		scan.close();
		
		for(int i=1; i<=n; i++) {
			sum = sum + (float)i/(float)(i+1);
		}
		
		//Lam tron 2 chu so thap phan
		NumberFormat format2Digits = NumberFormat.getNumberInstance();
		format2Digits.setMaximumFractionDigits(2);
		format2Digits.setRoundingMode(RoundingMode.UP);
		
		System.out.println("T = " + format2Digits.format(sum));
				
	}

}
