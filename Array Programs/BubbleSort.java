package arrayprograms;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {7,4,8,2,9};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=1; j<a.length; j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}

