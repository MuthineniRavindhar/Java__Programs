package arrayprograms;

public class PrimeElements {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6,7,9,13,11};
		
		for(int i=0; i<a.length; i++) {
			int count=0;
			for(int j=1; j<=a[i]; j++) {
				
				if(a[i]%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.print(a[i]+" ");
			}
			
		}
	}
}
