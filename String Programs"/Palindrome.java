public class Palindrome {

	public static void main(String[] args) {
		
		String s="Madam";
		String s1="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			s1=ch+s1;
		}
		
		if(s1.equalsIgnoreCase(s)) {  //IgnoreCase because in some situations user may enter Capital Letters.
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+" is not a palindrome");
		}
	}
}
