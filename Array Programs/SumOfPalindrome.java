package arrayprograms;

public class SumOfPalindrome {
	
	public static void main(String[] args) {
		
		int a[]= {3,5,8,6,9,2,6,24};	
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			
			sum=sum+a[i];
			
			if(palin(sum)) {
				System.out.println(sum+" is a polindrome");
			}
		}
		
		
	}
	
	public static boolean palin(int num) {
		int rev=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev==temp;
	}
}
