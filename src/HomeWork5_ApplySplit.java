import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork5_ApplySplit {
	
	//format word (capitalize the start character, un-capitalize the remaining characters)
	public static String formatedWord(String s) {
		String sTemp = "";
		
		//capitalize the start character
		if(97<=(int)s.charAt(0) && (int)s.charAt(0)<=122) {
			char temp = (char)((int)s.charAt(0)-32);
			sTemp += temp;
		}else {
			sTemp += s.charAt(0);
		}
		
		//un-capitalize the remaining characters
		for(int i=1; i<s.length(); i++) {
			if(65<=(int)s.charAt(i) && (int)s.charAt(i)<=90) {
				char temp = (char)((int)s.charAt(i)+32);
				sTemp += temp;
			}else {
				sTemp += s.charAt(i);
			}
		}
		return sTemp;
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi S: ");
		s = scan.nextLine();
		scan.close();
		
		String[] Words = s.split(" ");
		List<String> formatedWords = new ArrayList<String>();
		
		if(Words.length == 0) {
			System.out.println("S sau khi chuan hoa:");
		}else {
			for(int i=0; i<Words.length; i++) {
				if(!Words[i].equals("")) {
					formatedWords.add(formatedWord(Words[i]));
				}
			}
			
			//Print the words in list but excepting the final word 
			System.out.println("S sau khi chuan hoa: ");
			for(int i=0; i<formatedWords.size()-1; i++) {
				System.out.print(formatedWords.get(i) + " ");
			}
			
			//Print the final word
			System.out.println(formatedWords.get(formatedWords.size()-1));
		}
		
	}

}
