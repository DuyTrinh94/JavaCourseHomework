import java.util.Scanner;

public class HomeWork3_ApplySplit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao chuoi S: ");
		int count = 0;
		String s = scan.nextLine();
		scan.close();
		
		String[] Words = s.split(" ");
		for(int i = 0; i<Words.length; i++) {
			if(!Words[i].equals("")) {
				count++;
			}
		}
		System.out.println("Chuoi S co " + count + " tu");

	}

}
