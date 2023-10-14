package numberprograms;

public class SpyNumber {

	public static void main(String[] args) {
		
		for(int i=1; i<=200; i++) {
		int num=i;
		int temp=num;
		int sum=0;
		int pro=1;
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			pro=pro*rem;
			num=num/10;
		}
		if(pro==sum) {
			System.out.println(temp+" is a spy number");
		}
//		else {
//			System.out.println(temp+" is not a spy number");
//		}
		}
	}
}

//range of values from 1 to 200
