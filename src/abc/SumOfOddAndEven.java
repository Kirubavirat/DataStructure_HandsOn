package abc;

public class SumOfOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int oddCount=0;
		int evenCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount=evenCount+arr[i];
			}else {
				oddCount=oddCount+arr[i];
			}
		}
		System.out.println("count of even numbers are : "+evenCount);
		System.out.println("count of odd numbers are : "+oddCount);

	}

}
