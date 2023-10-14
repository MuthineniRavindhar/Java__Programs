public class PatternString {

	public static void main(String[] args) {
		
		String s="Ravi";
		String str="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			str=str+ch;
			for(int j=i; j<str.length(); j++) {
				System.out.print(str);
			}
			System.out.println();
		}
		
		
	}
}
