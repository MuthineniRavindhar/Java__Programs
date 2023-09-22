package strings;

public class LongestWord {

	public static void main(String[] args) {

		String s = "This is a java programming mock";
		String[] s1 = s.split(" ");
		String longestword = s1[0];
		for (String str : s1) {

			if (longestword.length() < str.length()) {
				longestword = str;
			}
		}
		System.out.println("longestword is : "+longestword);
	}
}
