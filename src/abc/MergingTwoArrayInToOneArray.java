package abc;

import java.util.Arrays;

public class MergingTwoArrayInToOneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {1,2,3,4,5};
		int array2[]= {6,7,8,9,10};
		int a=array1.length;
		int b=array2.length;
		int arr[]=new int [a+b];
		System.arraycopy(array1, 0, arr, 0, b);
		System.arraycopy(array2, 0, arr, a, b);
		System.out.println(Arrays.toString(arr));

	}

}
