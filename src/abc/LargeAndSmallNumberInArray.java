package abc;

public class LargeAndSmallNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,7,6,8,2,1,11};
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("minimum element in array is : "+min);
		System.out.println("maximum element in array is : "+max);

	}

}
