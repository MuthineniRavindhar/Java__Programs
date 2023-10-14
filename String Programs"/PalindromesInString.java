public class PalindromesInString {

	public static void main(String[] args) {
		
		String s="abhi121ihabebaja";
		
//		String str="";
		for(int i=0; i<s.length(); i++) {
//			str=s.charAt(i)+"";
			for(int j=i+1; j<=s.length(); j++) {
				String k=s.substring(i,j);
				if(isPalindrome(k)==true) {
				System.out.println(k);
				}
				
//				or we can do by this way also.. when we are using this j<s.length() dont forget it....
//				 str = str+s.charAt(j);
//				if(isPalindrome(str)) {
//					System.out.println(str);
//				}
				
			}
		}
	}
	public static boolean isPalindrome(String s) {
		
		String rev="";
		for(int i=0; i<s.length(); i++) {
			rev=s.charAt(i)+rev;
		}
		
		return s.equals(rev);
	}
}
