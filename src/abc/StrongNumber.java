package abc;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=145;
		int i,factorial,digit;
		int sum=0;
		int temp=number;
		while(temp!=0) {
			i=1;
			factorial=1;
			digit=temp%10;
		
		while(i<=digit) {
			factorial=factorial*i;
			i++;
		}
		sum=sum+factorial;
		temp=temp/10;
		}
		if(sum==number) {
			System.out.println(number+" is strong number");
		}else {
			System.out.println(number+" is not strong number");
		}
	}

}
