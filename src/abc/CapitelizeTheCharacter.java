package abc;

public class CapitelizeTheCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "java";
		int len=str.length();
		System.out.println(str.substring(0,1).toUpperCase()+str.substring(1,len-1)+str.substring(len-1).toUpperCase());

	}

}
