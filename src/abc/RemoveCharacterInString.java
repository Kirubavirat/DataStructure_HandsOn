package abc;

public class RemoveCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "ja";
		
			for(int j=0;j<s2.length();j++) {
				char ch =s2.charAt(j);
				while(s1.contains(ch + "")) {
					int a=s1.indexOf(ch);
					s1=s1.replace((ch +""),"");
				}
		}
			System.out.println(s1);

	}

}
