package strings;

public class ReverseSentence2 {

	public static void main(String[] args) {
		
		String s="java html css";
		
		
		String rev="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			rev=ch+rev;
		}
//		System.out.print(rev);
//		System.out.println();
		
		String[] s1=rev.split(" ");
		
		for(int i=s1.length-1; i>=0; i--) {
			
			String k = s1[i]+" ";
			System.out.print(k);
		}

	}
}
