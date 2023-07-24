package abc;

import java.util.Arrays;

public class CheckingTwoArraysEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1 [] = {1,2,3,4,5};
		int array2 [] = {2,1,4,3,5};
		
		if(array1.length==array2.length) {
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			boolean result =Arrays.equals(array1, array2);
			if(result) {
				System.out.println("equals");
			}else {
				System.out.println("not equals");
			}
			
			
		}else {
			System.out.println("not equal");
		}
	}

	

}
