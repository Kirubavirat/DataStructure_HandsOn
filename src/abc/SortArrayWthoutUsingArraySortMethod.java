package abc;

public class SortArrayWthoutUsingArraySortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,2,1,3,5};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println("After sorting array :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("new array");
		int array[]=new int[arr.length];
		array=arr;
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
