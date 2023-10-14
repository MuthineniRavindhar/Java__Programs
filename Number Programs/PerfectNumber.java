package numberprograms;

public class PerfectNumber {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
		int num=i;
		int sum=0;
		for(int j=1; j<num; j++) {
			if(num%j==0) {
				sum=sum+j;
			}
		}
		if(sum==num) {
			System.out.println(num+" is a perfect number");
		}
//		else {
//			System.out.println(num+" is not a perfect number");
//		}
		}
	}
}


//range of values from 1 to 100
