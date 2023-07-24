package abc;

import java.util.Scanner;

public class CountOfVowelsAndConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word = sc.next();
		word = word.toLowerCase();
		int vowelsCount = 0;
		int constantCount = 0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' ||
					word.charAt(i)=='u') {
				vowelsCount++;
			}else if(word.charAt(i)>='a' && word.charAt(i)<='z') {
				constantCount++;
			}
		}
		System.out.println("Count of Vowels is : "+vowelsCount);
		System.out.println("Count of Constant is : "+constantCount);

	}

}
