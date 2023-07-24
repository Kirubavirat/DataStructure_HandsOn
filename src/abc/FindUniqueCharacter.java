package abc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word = sc.next();
		System.out.println("the unique elements in string are :");
		Set<Character> set = new HashSet<>();
		if(word.isEmpty() || word.length()==0) {
			System.out.println("the string is empty");
			
		}
		for(int i=0;i<word.length();i++) {
			set.add(word.charAt(i));
		}
		System.out.println(set);
				
		

	}

}
