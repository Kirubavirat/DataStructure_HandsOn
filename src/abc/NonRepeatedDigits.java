package abc;

import java.util.Arrays;

public class NonRepeatedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,3,2,1};
		boolean array[]=new boolean[arr.length];
		Arrays.fill(array, false);
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(array[i]==true) {
				continue;
			}
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					array[j]=true;
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}

	}

}
