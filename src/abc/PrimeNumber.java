package abc;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<100;i++) {
			 count=1;
			 for(int j=2;j<i;j++) {
				 if(i%j==0) {
					 count++;
				 }
			 }
			 if(count==1) {
				 System.out.println(i);
			 }
		}

	}

}
