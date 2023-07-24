package abc;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,7,6,9,10};
		int n=arr.length;
		Arrays.sort(arr);
		int SecondLargestNumber=arr[n-2];
		System.out.println("Second Largest Number is : "+SecondLargestNumber);

	}

}
