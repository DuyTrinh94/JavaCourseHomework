import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CoronaHomework4 {
	
	static Set<String> permutations;

    private static void addChar(char c) {
        if (permutations.size() == 0) {
            permutations.add(String.valueOf(c));
        }else {
        	Set<String> result = new HashSet<String>();
            Iterator<String> it = permutations.iterator();
 

            while(it.hasNext()) {
            	String temp = it.next();
            	
            	for (int k=0; k<temp.length()+1; k++) {
            		StringBuilder sb = new StringBuilder(temp);
                    sb.insert(k, c);
                    result.add(sb.toString());
                }
            }

            permutations = result;
        }
    }
    
    public static Set<String> permutation(String string) {
        permutations = new HashSet<String>();
 
        int n = string.length();
        for (int i=n-1; i>=0; i--) 
        {
            addChar(string.charAt(i));
        }
        return permutations;
    }
 
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String s;
    	System.out.println("Nhap vao chuoi S: ");
    	s = scan.nextLine();
    	scan.close();
    	
        Set<String> result = permutation(s);
 
        System.out.println("Co tong cong " + result.size() + " hoan vi:");
        Iterator<String> it = result.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
