public class CountCharacters {

	public static void main(String[] args) {
		String s="aA1@38#7bde*5";
		int alphabetCount=0;
		int specialCharCount=0;
		int digitCount=0;
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
				alphabetCount++;
			}
			else if(ch>='0'&&ch<='9') {
				digitCount++;
			}
			else {
				specialCharCount++;
			}
		}
		System.out.println("The Number of Alphabets are :"+ alphabetCount);
		System.out.println("The Number of Digits are :"+ digitCount);
		System.out.println("The Number of Special Characters are :"+ specialCharCount);
	}
}
