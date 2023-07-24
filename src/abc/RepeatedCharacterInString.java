package abc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		int count = 0;
		char []s = str.toCharArray();
		System.out.println("repeated character in strings are :");
		for(int i=0;i<s.length;i++) {
			count=1;
			for(int j=i+1;j<s.length;j++) {
				if(s[i]==s[j]&&s[i]!=' ') {
					count++;
					s[j]='0';
				}
			}
			if(count>1 && s[i]!='0') {
				System.out.println(s[i]);
			}
		}
		
		

	}

}
