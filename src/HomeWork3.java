import java.util.Scanner;

public class HomeWork3 {
	public static final char SPACE = ' ';
	
	public static int countWords(String s) {
		int count = 0;
		boolean isCounted = false;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != SPACE) {
				if(!isCounted) {
					count++;
					isCounted = true;
				}
			}else {
				isCounted = false;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao chuoi S: ");
		String s = scan.nextLine();
		scan.close();
		
		if(s.equals("")) {
			System.out.println("Chuoi S co 0 tu");
		}else {
			System.out.println("Chuoi S co " + countWords(s) + " tu");
		}
	}

}
