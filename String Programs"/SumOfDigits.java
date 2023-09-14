public class SumOfDigits {

	public static void main(String[] args) {
		
		String s="1ja2v3a4";
		int sum=0;
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			
			if(ch>='0'&&ch<='9') {
				int j = Integer.parseInt(ch+"");
				sum=sum+j;
//				(or)
//				int k=ch-48;
//				sum=sum+k;
				
			}
			
		}
		System.out.println("Sum of the Digits is : "+sum);	
	}
}
