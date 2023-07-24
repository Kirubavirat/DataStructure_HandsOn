package abc;

public class CheckTwoStringsReverseOfEachOtherOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstString="abcd";
		firstString=firstString.toLowerCase();
		String string="";
		String secondString = "dcba";
		secondString=secondString.toLowerCase();
		
		for(int i=firstString.length()-1;i>=0;i--) {
			string+=firstString.charAt(i);
			
		}
		
		if(string.equals(secondString)) {
			System.out.println("the given string is reverse of other string");
		}else {
			System.out.println("the given string is not reverse of other string");
		}
		
		

	}

}
