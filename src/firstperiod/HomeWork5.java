package firstperiod;

import java.util.Scanner;

public class HomeWork5 {
	public static final char SPACE = ' ';
	//reverse string
	public static String reverse(String s) {
		String sTemp = "";
		for(int i=s.length()-1; i>=0; i--) {
			sTemp += s.charAt(i);
		}
		return sTemp;
	}
	
	//trim head
	public static String trimHead(String s) {
		String sTemp = "";
		boolean stopTrim = false;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != SPACE && !stopTrim) {
				sTemp += s.charAt(i);
				stopTrim = true;
			}else if(stopTrim) {
				sTemp += s.charAt(i);
			}
		}
		return sTemp;
	}
	
	//trim end
	public static String trimEnd(String s) {
		return reverse(trimHead(reverse(s)));		
	}
	
	//format string (capitalize/un-capitalize, remove middle spaces)
	public static String formatString(String s) {
		String sTemp = "";
		boolean isWord = false;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=SPACE) {
				if(!isWord) {
					if(97<=(int)s.charAt(i) && (int)s.charAt(i)<=122) {
						char temp = (char)((int)s.charAt(i)-32);
						sTemp += temp;
					}else {
						sTemp += s.charAt(i);
					}
					isWord = true;
				}else {
					if(65<=(int)s.charAt(i) && (int)s.charAt(i)<=90) {
						char temp = (char)((int)s.charAt(i)+32);
						sTemp += temp;
					}else {
						sTemp += s.charAt(i);
					}
				}
			}else {
				if(isWord && i!=s.length()-1) {
					sTemp += s.charAt(i);
					isWord = false;
				}
			}
		}
		return sTemp;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s;
		do {
			System.out.println("Nhap vao chuoi S: ");
			s = scan.nextLine();
		}while(s.equals(""));
		scan.close();
		
		System.out.println(trimEnd(formatString(s)));
	
	
	}
}
