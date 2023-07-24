package abc;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="abb";
	stringPermutation(s,"");

	}
	
	public static void stringPermutation(String str,String s1) {
		if(str.length()==0) {
			System.out.println(s1+" ");
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			String ss = str.substring(0,i)+str.substring(i+1);
			
			 stringPermutation(ss,s1+ch);
		}
	}

}
