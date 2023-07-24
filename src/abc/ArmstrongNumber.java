package abc;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int rem,sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}

	}

}
