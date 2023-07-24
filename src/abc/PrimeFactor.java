package abc;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=24;
		for(int i=2;i<number;i++) {
			while(number%i==0) {
				System.out.println(i+" ");
				number=number/i;
			}
		}
		if(number>2) {
			System.out.println(number);
		}

	}

}
