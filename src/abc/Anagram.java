package abc;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first="car";
		String second = "arc";
		first=first.toLowerCase();
		second=second.toLowerCase();
		if(first.length()==second.length()) {
			char [] ca = first.toCharArray();
			char [] cb = second.toCharArray();
			Arrays.sort(ca);
			Arrays.sort(cb);
			
			boolean result =Arrays.equals(ca, cb);
			if(result) {
				System.out.println("Anagram");
			}else {
				System.out.println("not Anagram");
			}
			
		}else {
			System.out.println("not Anagram");
		}

	}

}
