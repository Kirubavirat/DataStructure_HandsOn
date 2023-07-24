package abc;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		int n=3;
		for(int i=0;i<n;i++) {
			int j,first;
			first=arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println();
		System.out.println("After array rotation");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
