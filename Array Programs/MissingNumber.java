package arrayprograms;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[]= {1,5,6,3,9};
		
//		take smallest number from the array and as well as largest number
//		we are supposed to print in b/w smallest and largest -->missing numbers 
		
		for(int i=1; i<=9; i++) {
			int	flag=0;
			
			for(int j=0; j<a.length; j++) {
				if(i==a[j]) {
					 flag=1;
					 break;
				}
			}
			if(flag==0) {
				System.out.println(i);
//				means if still flag is zero the element was not found in the array...
//				so we are printing that element
			}
		}
	}
}
