package strings;

public class ReverseSentence {

	public static void main(String[] args) {

		String s = "java html css";

		String rev = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			rev = ch + rev;
		}
		System.out.print(rev);
	}
}
