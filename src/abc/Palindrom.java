package abc;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="madam";
		String s2="";
		String s=s1;
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s.equals(s2)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}

	}

}
