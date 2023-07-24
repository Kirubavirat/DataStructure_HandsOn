package abc;

public class RangeOfArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,rem,n;
		
		for(int i=1;i<=1000;i++) {
			n=i;
			while(n>0) {
				rem=n%10;
				sum=sum+rem*rem*rem;
				n=n/10;
				
				
			}
			if(sum==i) {
			
			System.out.println(i);
			}
			sum=0;
			
		}
		

	}

}
