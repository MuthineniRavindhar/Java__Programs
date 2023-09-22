package strings;

public class ReverseSentence1 {

	public static void main(String[] args) {
		
		String s="java html css";
		
		String[] s1=s.split(" ");
		String rev="";
		for(int i=s1.length-1; i>=0; i--) {
			
			rev=rev+s1[i]+" ";
		}
		System.out.print(rev);
	}
}
