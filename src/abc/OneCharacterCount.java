package abc;

public class OneCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="capgemini";
		char ch='i';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println("count of "+ch+" is : "+count);

	}

}
