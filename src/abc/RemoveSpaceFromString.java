package abc;

import java.util.Scanner;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=" ca p ge mi ni";
		String s="";
		
		Scanner sc = new Scanner(str);
		while(sc.hasNext()) {
			s+=sc.next();
		}
		System.out.println(s);

	}

}
