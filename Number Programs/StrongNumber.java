package numberprograms;

public class StrongNumber {

	public static void main(String[] args) {
		
		for(int i=1; i<=200; i++) {
		int num=i;
		int temp=num;
		int sum=0;
		
		while(num!=0) {
			int rem=num%10;
			int fact=1;
			for(int j=1; j<=rem; j++) {
				 fact=fact*j;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a strong number");
		}
//		else {
//			System.out.println(temp+" is not a strong number");
//		}
		}
	}
}
