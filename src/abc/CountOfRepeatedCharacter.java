package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String word =sc.next();
		Map<Character,Integer>map = new HashMap<>();
		System.out.println("Count of character are : ");
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(map.containsKey(ch)) {
				int a = map.get(ch);
				map.put(ch, ++a);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		

	}

}
