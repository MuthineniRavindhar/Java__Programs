package strings;

public class SubstringsOfString {

	public static void main(String[] args) {

		String s = "Ravi";

		System.out.println("The SubStrings of " + s + " are :");
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}
}
